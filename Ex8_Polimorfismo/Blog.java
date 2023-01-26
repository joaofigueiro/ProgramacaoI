import java.util.*;

public class Blog extends Exception{
    private List<Post> posts = new ArrayList<Post>(); 

    public void showAll(Blog blog){
        for(int i = 0; i < this.posts.size(); i++){
            blog.posts.get(i).show();
        }
    }

    public void readData(Post p, Scanner entrada){
        
        System.out.println("Informe o título da publicação: ");
        String titulo = new String();
        titulo = entrada.nextLine();

        for(int i = 0; i < this.posts.size(); i++){
            if(titulo.equals(this.posts.get(i).getTitle())){
                throw new RuntimeException("Título já existente. Informe outro!");
            }
        }

        System.out.println("Informe o conteúdo da publicação: ");
        String content = new String();
        content = entrada.nextLine();

        if(p instanceof News){
            System.out.println("Informe a fonte da publicação:");
            String source = new String();
            source = entrada.nextLine();
            ((News)p).setSource(source);
        } else if (p instanceof ProductReview){
            System.out.println("Informe a marca do produto:");
            String brand = new String(); 
            brand = entrada.next();
            ((ProductReview)p).setBrand(brand);
        } 

        p.setPost(titulo, content);
    }

    public void menu() {
        System.out.println("BLOG: O que você quer fazer?");
        System.out.println("1 - Novo Post de Notícia");
        System.out.println("2 - Nova Resenha de Produto");
        System.out.println("3 - Novo Post de outros assuntos");
        System.out.println("4 - Listar todas as postagens");
        System.out.println("5 - Curtir uma postagem");
        System.out.println("6 - Descurtir uma postagem");
        System.out.println("10 - Sair");
        System.out.println("Escolha a opção:");
    }

    public void curtirPublicacao(Blog blog, Scanner entrada) throws IndexOutOfBoundsException{
        
        try{
            System.out.print("Informe o indíce da publicação que deseja curtir: ");
            int indice = entrada.nextInt();
            blog.posts.get(indice).setlikes(); 
            System.out.println("Publicação curtida!");
        }catch(IndexOutOfBoundsException error){
            System.out.println("Código inválido, Postagem inexistente!");
        }catch(InputMismatchException NotIntError){
            System.out.println("Entrada inválida! Utilize apenas números inteiros");
        }        
    }

    public void descurtirPublicacao(Blog blog, Scanner entrada) throws IndexOutOfBoundsException{
        
        try{
            System.out.print("Informe o indíce da publicação que deseja descurtir: ");
            int indice = entrada.nextInt();
            blog.posts.get(indice).setdislikes(); 
            System.out.println("Publicação descurtida!");
        }catch(IndexOutOfBoundsException error){
            System.out.println("Código inválido, Postagem inexistente!");
        }catch(InputMismatchException NotIntError){
            System.out.println("Entrada inválida! Utilize apenas números inteiros");
        }        
    }

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Scanner entradaPublicacao = new Scanner(System.in); 
        Blog blog = new Blog();
        int control = 0;

        while(control != 10){
            blog.menu();
            control = entrada.nextInt();
            if(control == 1){
                News news = new News(); 
                blog.readData(news, entradaPublicacao); 
                blog.posts.add(news); 
            } else if (control == 2){
                ProductReview ProdRev = new ProductReview();
                blog.readData(ProdRev, entradaPublicacao); 
                blog.posts.add(ProdRev);
            } else if (control == 3){
                Post post = new Post();
                blog.readData(post, entradaPublicacao);
                blog.posts.add(post);
            } else if (control == 4){
                blog.showAll(blog);
            } else if (control == 5){
                blog.curtirPublicacao(blog, entrada); 
            } else if (control == 6){
                blog.descurtirPublicacao(blog, entrada); 
            }
        }
        entrada.close();
        entradaPublicacao.close();
    }
}