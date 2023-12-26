import java.util.Scanner;
class Books{
	String name;
	String author;
	int price;
	int numPages;
	Books(String name,String author,int price,int numPages){
		this.name = name;
		this.author = author;
		this.price = price;
		this.numPages = numPages;
	}
	public String toString(){
		String name = "Book Name : " + this.name + "\n";
		String author = "Author Name : " + this.author + "\n";
		String price = "Price : " + this.price + "\n";
		String numPages = "Number of Pages : " + this.numPages + "\n";
		return name + author + price + numPages;
	}
}
class BookProgram{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Books b[] = new Books[n];
		for(int i = 0 ; i < n ; i++){
			String name = s.next();
			String author = s.next();
			int price = s.nextInt();
			int numPages = s.nextInt();
			b[i] = new Books(name, author, price, numPages);
		}
		for(int i = 0 ; i < n ; i++){
			System.out.println(b[i].toString());
		}
		
	}
}

		
	