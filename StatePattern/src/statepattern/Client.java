package statepattern;

public class Client {
	public static void main(String[] args) {
		// ��ȡ�������
		HomeContext ctx = new HomeContext();
		// ���÷���״̬
		ctx.setState(new FreeState());
		ctx.setState(new BookedState());
	}
}

