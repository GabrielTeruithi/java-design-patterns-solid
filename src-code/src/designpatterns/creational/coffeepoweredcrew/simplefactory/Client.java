package designpatterns.creational.coffeepoweredcrew.simplefactory;

public class Client {

	public static void main(String[] args) {

		Post post = PostFactory.createPost("blog");
		System.out.println(post);
		
		Post news = PostFactory.createPost("news");
		System.out.println(news);

	}

}
