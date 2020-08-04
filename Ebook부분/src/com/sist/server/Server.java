package com.sist.server;
import java.util.*;

import com.sist.common.Function;

import java.net.*;
import java.io.*;
public class Server implements Runnable{
    
	ServerSocket ss;
	final int PORT=3355;
	
	Vector<Client> waitVc=new Vector<Client>();
	
	public Server()
	{
		try
		{
			ss=new ServerSocket(PORT);
			
			System.out.println("Server Start...");
		}catch(Exception ex){}
	}
	
	public void run()
	{
		try
		{
			while(true)
			{
			    Socket s=ss.accept();
				  
				Client client=new Client(s);
				client.start(); 
			}
		}catch(Exception ex){}
	}
	
	class Client extends Thread
	{
		
		Socket s;
		
		OutputStream out;
		BufferedReader in;
		
		String id,name,sex;
		public Client(Socket s)
		{
		
			try
			{
			  this.s=s;
			  
			  out=s.getOutputStream(); 
			  
			  in=new BufferedReader(new InputStreamReader(s.getInputStream()));
			  
			}catch(Exception ex){}
		}
		
		public void run()
		{
			try
			{
				while(true)
				{
					String msg=in.readLine();
					System.out.println("client=>"+msg);
					
					StringTokenizer st=new StringTokenizer(msg,"|");
					int protocol=Integer.parseInt(st.nextToken());
					
					switch(protocol)
					{
						case Function.LOGIN:
						{
							id=st.nextToken();
							name=st.nextToken();
							sex=st.nextToken();
							
							messageAll(Function.LOGIN+"|"+id+"|"+name+"|"+sex);
							
							waitVc.add(this);
							
							messageTo(Function.MYLOG+"|"+id);
							
							for(Client user:waitVc)
							{
								messageTo(Function.LOGIN+"|"
										+user.id+"|"+user.name+"|"+user.sex);
							}
						}
						break;
						case Function.CHAT:
						{
							messageAll(Function.CHAT+"|["+name+"]"+st.nextToken());
						}
						break;
						case Function.EXIT:
						{
							String mid=id;
							messageAll(Function.EXIT+"|"+mid);
							
							for(Client user:waitVc)
							{
								if(user.id.equals(id))
								{
									messageTo(Function.MYEXIT+"|");
									waitVc.remove(user);
									in.close();
									out.close();
									
									break;
								}
							}
						}
						break;
					}
					
				}
			}catch(Exception ex) {}
		}
		
		public void messageAll(String msg)
		{
			for(Client user:waitVc)
			{
				try
				{
				    user.messageTo(msg);	
				}catch(Exception ex)
				{
					waitVc.remove(user);
				}
			}
			
		}
		
		public void messageTo(String msg)
		{
			try
			{
				out.write((msg+"\n").getBytes());
				
			}catch(Exception ex) {}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Server server=new Server(); 
        new Thread(server).start();
	}

}