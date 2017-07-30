package jsjf;

public class Book {
	private int chapters, pages;
	private String name;
	
	public Book(String bookName, int a, int b)
	{
		name = bookName;
		chapters = a;
		pages = b;		
	}

	public int getChapters() 
	{
		return chapters;
	}

	public void setChapters(int chapters) 
	{
		this.chapters = chapters;
	}

	public int getPages() 
	{
		return pages;
	}

	public void setPages(int pages) 
	{
		this.pages = pages;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
	public String toString()
	{
		String result = name + " has " + chapters + " chapters and has " + pages + " pages. \n";
		
		return result;
	}

}
