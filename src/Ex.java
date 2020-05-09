abstract class Woman{
	public int height, weight, iq;
	abstract void eat();
	abstract void study(); 
	abstract void chat(); 
}

class Girl extends Woman{
	public Girl() {
		height = 160;
		weight = 50;
		iq = 110;
	}
	public Girl(int h, int w, int iq) {
		this.height = h;
		this.weight = w;
		this.iq = iq;
	}
	@Override
	public void eat() {
		this.weight+=2;
		System.out.println("���� ü���� " + this.weight + "kg �Դϴ�.");
	}
	public void study() {
		this.iq+=5;
		System.out.println("���� ������ " + this.iq + " �Դϴ�.");
	}
	public void chat() {
		this.weight--;
		System.out.println("���� ü���� " + this.weight + "kg �Դϴ�.");
	}
	public void showstate() {
		System.out.println("���� ���´� " + this.height + "cm, " + this.weight + "kg, " + this.iq +" �Դϴ�.");
	}
}
public class Ex {
	public static void main(String[] args) {
		Girl girl1 = new Girl();
		Girl girl2 = new Girl(173, 54, 135);
		girl2.showstate();
		girl1.showstate();
		girl1.eat();
		girl1.chat();
		girl1.study();
		girl1.showstate();
	}
}
