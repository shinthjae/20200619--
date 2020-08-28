package com.sist.manager;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.sist.dao.MusicDAO;

/*
 *  <tr class="list" songId="90726458">
    <td class="check"><input type="checkbox" class="select-check" title=" 내가 아는 그대 "/>
  <td class="number" list-role="번호">1
    <td><a href="#" class="cover"  onclick="fnViewAlbumLayer(81549860); return false;" ontouchend="fnViewAlbumLayer(81549860); return false;" ><span class="mask"></span><img onerror="this.src='//image.genie.co.kr/imageg/web/common/blank_68.gif';" src="//image.genie.co.kr/Y/IMAGE/IMG_ALBUM/081/549/860/81549860_1598338597705_1_140x140.JPG" alt="내가 아는 그대" /></a></td>
    <td class="link"><a href="#" class="btn-basic btn-info" onclick="fnViewSongInfo(90726458); return false;" ontouchend="fnViewSongInfo(90726458); return false;" >곡 제목 정보 페이지</a></td>
      <td class="info">
           <a href="#" class="title ellipsis" title="내가 아는 그대" onclick="fnPlaySong('90726458;','1'); return false;" ontouchend="fnPlaySong('90726458;','1'); return false;">
내가 아는 그대</a>
            <a href="#" class="artist ellipsis"onclick="fnViewArtist(80635263); return false;" ontouchend="fnViewArtist(80635263); return false;" >이사배</a>           <div class="toggle-button-box" id="hide-button">
               <button type="button" class="btn artist-etc"onclick="fnRelationArtistList('90726458'); artist_etc_layer._show(this);return false;" ontouchend="fnRelationArtistList('90726458'); artist_etc_layer._show(this);return false;" >외</button>
               <dl class="list" id="RelationArtist_90726458">
               </dl>
           </div>
            <i class="bar">|</i>
            <a href="#" class="albumtitle ellipsis" onclick="fnViewAlbumLayer(81549860); return false;" ontouchend="fnViewAlbumLayer(81549860); return false;" >내가 아는 그대 (X-MAS Project Special)</a>
        </td>
 */

//a태그 => 아이디로 되어 있는지. 클래스로 되어 있는지 확인.
// img에 슬래시가 하나 붙으면 서버주소 써야함 두개 붙으면 안써도됨 확인  없으면 서버주소 붙여야

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
		    			System.out.println("번호:"+ k++);
		    			System.out.println("cateno:1");
		    			System.out.println("제목:"+title.get(j).text());
		    			System.out.println("가수명:"+singer.get(j).text());
		    			System.out.println("앨범:"+album.get(j).text());
		    			System.out.println("포스터:"+poster.get(j).attr("src"));
	    			    System.out.println("==============================");
	    			    
	    			    // vo에 값을 채운다 => DAO
	    			    vo.setCateno(10);///////////////////////
	    			    vo.setTitle(title.get(j).text());
	    			    vo.setSinger(singer.get(j).text());
	    			    vo.setAlbum(album.get(j).text());
	    			    vo.setPoster(poster.get(j).attr("src"));
	    			    
	    			    // DAO로 전송 
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