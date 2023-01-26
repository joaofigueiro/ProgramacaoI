import java.util.*;

public class Post{
    private String title; 
    private Date date; 
    private String content; 
    private int likes; 
    private int dislikes; 

    public void show(){
        System.out.println("Título: "+ this.title + "Data: "+this.date );
        System.out.println("Conteúdo: "+ this.content);
    }

    public String getTitle(){
        return this.title; 
    }

    public void setTitle(String title){
        this.title = title; 
    }

    public void setContent(String content){
        this.content = content; 
    }

    public void setlikes(){
        this.likes += 1; 
    }

    public int getlikes(){
        return this.likes; 
    }

    public void dislike(){
        this.dislikes += 1; 
    }

    public int getdislikes(){
        return this.dislikes; 
    }

    public void setPost(String title, String content){
        this.title = title; 
        this.content = content; 
        this.date = new Date(); 
    }
}