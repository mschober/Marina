package utils;

public class Tag {

	private String name;
	private String text;

	public Tag(String name, String text) {
		this.name = name;
		this.text = text;
	}
	
	@Override
	public String toString(){
		return "<" + name + ">" + text + "</" + name + ">";
	}

}
