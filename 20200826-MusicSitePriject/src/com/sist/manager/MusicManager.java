package com.sist.manager;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.sist.dao.MusicDAO;

/*
 *  <tr class="list" songId="90726458">
    <td class="check"><input type="checkbox" class="select-check" title=" ���� �ƴ� �״� "/>
  <td class="number" list-role="��ȣ">1
    <td><a href="#" class="cover"  onclick="fnViewAlbumLayer(81549860); return false;" ontouchend="fnViewAlbumLayer(81549860); return false;" ><span class="mask"></span><img onerror="this.src='//image.genie.co.kr/imageg/web/common/blank_68.gif';" src="//image.genie.co.kr/Y/IMAGE/IMG_ALBUM/081/549/860/81549860_1598338597705_1_140x140.JPG" alt="���� �ƴ� �״�" /></a></td>
    <td class="link"><a href="#" class="btn-basic btn-info" onclick="fnViewSongInfo(90726458); return false;" ontouchend="fnViewSongInfo(90726458); return false;" >�� ���� ���� ������</a></td>
      <td class="info">
           <a href="#" class="title ellipsis" title="���� �ƴ� �״�" onclick="fnPlaySong('90726458;','1'); return false;" ontouchend="fnPlaySong('90726458;','1'); return false;">
���� �ƴ� �״�</a>
            <a href="#" class="artist ellipsis"onclick="fnViewArtist(80635263); return false;" ontouchend="fnViewArtist(80635263); return false;" >�̻��</a>           <div class="toggle-button-box" id="hide-button">
               <button type="button" class="btn artist-etc"onclick="fnRelationArtistList('90726458'); artist_etc_layer._show(this);return false;" ontouchend="fnRelationArtistList('90726458'); artist_etc_layer._show(this);return false;" >��</button>
               <dl class="list" id="RelationArtist_90726458">
               </dl>
           </div>
            <i class="bar">|</i>
            <a href="#" class="albumtitle ellipsis" onclick="fnViewAlbumLayer(81549860); return false;" ontouchend="fnViewAlbumLayer(81549860); return false;" >���� �ƴ� �״� (X-MAS Project Special)</a>
        </td>
 */

//a�±� => ���̵�� �Ǿ� �ִ���. Ŭ������ �Ǿ� �ִ��� Ȯ��.
// img�� �����ð� �ϳ� ������ �����ּ� ����� �ΰ� ������ �Ƚᵵ�� Ȯ��  ������ �����ּ� �ٿ���

public class MusicManager {
    public void musicAllData()
    {
    	MusicDAO dao=new MusicDAO();
    	try
    	{
    		int k=1;
    		for(int i=1;i<=5;i++)
    		{
	    		Document doc=Jsoup.connect("https://www.genie.co.kr/genre/L0207?genreCode=L0207&pg="+i).get();
	    		
	    		Elements title=doc.select("td.info a.title");
	    		Elements singer=doc.select("td.info a.artist");
	    		Elements album=doc.select("td.info a.albumtitle");
	    		Elements poster=doc.select("a.cover img");
	    		
	    		for(int j=0;j<title.size();j++)
	    		{
	    			try
	    			{
		    			MusicVO vo=new MusicVO();
		    			System.out.println("��ȣ:"+ k++);
		    			System.out.println("cateno:1");
		    			System.out.println("����:"+title.get(j).text());
		    			System.out.println("������:"+singer.get(j).text());
		    			System.out.println("�ٹ�:"+album.get(j).text());
		    			System.out.println("������:"+poster.get(j).attr("src"));
	    			    System.out.println("==============================");
	    			    
	    			    // vo�� ���� ä��� => DAO
	    			    vo.setCateno(10);///////////////////////
	    			    vo.setTitle(title.get(j).text());
	    			    vo.setSinger(singer.get(j).text());
	    			    vo.setAlbum(album.get(j).text());
	    			    vo.setPoster(poster.get(j).attr("src"));
	    			    
	    			    // DAO�� ���� 
	    			    dao.musicInsert(vo);
	    			    Thread.sleep(100);
	    			   
	    			    
	    			}catch(Exception ex){}
	    		}
	    		System.out.println("End...");
    		}
    		
    	}catch(Exception ex){}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MusicManager m=new MusicManager();
        m.musicAllData();
	}

}