package node;

public class IdNode implements ValueNode{
	public String idString;
	
	public IdNode(String text) {
		idString = text;
	}
	
	@Override
	public String toString(){
		return idString;
	}
}
