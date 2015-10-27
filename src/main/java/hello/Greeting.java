package hello;

public class Greeting {

    private long id;
    private  int content;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getContent() {
		return content;
	}
	public void setContent(int content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Greeting [id=" + id + ", content=" + content + "]";
	}
	public Greeting(long id, int content) {
		super();
		this.id = id;
		this.content = content;
	}
	
    
	
    
}

