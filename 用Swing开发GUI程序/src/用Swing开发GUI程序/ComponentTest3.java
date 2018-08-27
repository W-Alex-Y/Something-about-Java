package 用Swing开发GUI程序;
 
import javax.swing.*;

public class ComponentTest3 extends JFrame{
	private JRadioButton rbSex1 = new JRadioButton("男", true);
	private JRadioButton rbSex2 = new JRadioButton("女", false);
	private JComboBox jcbb = new JComboBox();
	private JCheckBox jc1 = new JCheckBox("唱歌", true);
	private JCheckBox jc2 = new JCheckBox("跳舞");
	private JPanel jpl = new JPanel();
	public ComponentTest3(){
		ButtonGroup bg = new ButtonGroup();
		bg.add(rbSex1);
		bg.add(rbSex2);
		jcbb.addItem("北京");
		jcbb.addItem("上海");
		jcbb.addItem("天津");
		jpl.add(rbSex1);
		jpl.add(rbSex2);
		jpl.add(jc1);
		jpl.add(jc2);
		jpl.add(jcbb);
		this.add(jpl);
		this.setSize(100, 180);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		new ComponentTest3();
	}
 
}
