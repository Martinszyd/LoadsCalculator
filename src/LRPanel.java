import javax.swing.*;
import java.awt.*;

public class LRPanel extends JPanel {

    JTextField weightField;
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    JLabel label5;
    JLabel label6;
    JLabel label7;

    public static final int HEIGHT = 350;
    public static final int WIDTH = 370;
    private int fieldHight = 25;
    private int fieldWidth = 50;

    Logics calcs = new Logics();

    public void recalculatePanel() {
        calcs.LBweight = weightField.getText();
        calcs.PeopleNo = personsField.getText();
        calcs.weightInLbCalc();
        calcs.totalWeightCalc();
        calcs.davitWeightCalc();
        reInitializeLabels();
    }

    private void initializeLabels() {
        label1 = new JLabel("________________________________");
        label2 = new JLabel("Calculated weight to be loaded to LB: ");
        label3 = new JLabel(String.valueOf(calcs.weightInLB));
        label4 = new JLabel("Calculated total load: ");
        label5 = new JLabel(String.valueOf(calcs.totalWeight));
        label6 = new JLabel("Calculated weight to be used for Davit test: ");
        label7 = new JLabel(String.valueOf(calcs.davitWeight));
    }

    private void reInitializeLabels() {
        label3.setText(String.valueOf(calcs.weightInLB));
        label5.setText(String.valueOf(calcs.totalWeight));
        label7.setText(String.valueOf(calcs.davitWeight));

    public LRPanel() {

            add(new JLabel("Weights to for Davit's test. (kg)"));
            add(new JLabel("_______________________________________"));

            setLayout(new FlowLayout(FlowLayout.CENTER));
            setPreferredSize(new Dimension(WIDTH, HEIGHT));
            setBackground(Color.white);

            Dimension fieleds = new Dimension(fieldWidth, fieldHight);

            add(new JLabel("SWL of the Davit: "));
            JTextField weightField = new JTextField();
            weightField.setPreferredSize(fieleds);
            add(weightField);

            add(new JLabel("_______________________________________"));

            initializeLabels();

            add(label6);
            add(label7);

        }
    }
}
