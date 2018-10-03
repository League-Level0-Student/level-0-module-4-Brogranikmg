import javax.swing.JOptionPane;

public class OwnAdventure {
	public static void main(String[] args) {
		String leg = "leg";
		int chornobyl = 0;
		while (leg == "leg") {
			Object[] lliiop = {"glug glugg", "do not sip", "wait what? where am i"};
			int well_okay = JOptionPane.showOptionDialog(null, "you find yourself in front of a fountain?, What do?", "Fountain", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, lliiop, null);
			switch (well_okay) {
			case 0:
				JOptionPane.showMessageDialog(null, "and die of radiation poisoning ~");
				leg = "FOOT";
				break;
			case 1:
				JOptionPane.showMessageDialog(null, "a good thing s too. yoput back on your hazmat suit and the power plant in the vkaocground explodes',\n tbut then suddenly your'e back");
				break;
			case 2:
				switch (chornobyl) {
				case 0:
					JOptionPane.showMessageDialog(null, "chenrobyl,");
					break;
				case 1:
					JOptionPane.showMessageDialog(null, "i said shernobyl \"You Idiot\"");
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "sreiously your right by the Chronobyl Nucular power Plant");
					break;
				default:
					JOptionPane.showMessageDialog(null, "shut Op:");
					break;
				}
				chornobyl++;
				break;
			}
		}
	}
}
