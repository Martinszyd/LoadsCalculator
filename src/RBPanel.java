import javax.swing.*;
import java.awt.*;

public class RBPanel extends JPanel {

    public static final int HEIGHT = 350;
    public static final int WIDTH = 370;
    private int fieldHight = 25;
    private int fieldWidth = 50;

    protected double weightOfRB;
    protected int noOfPeople;
    protected String weightInRB;
    protected String totalWeight;
    protected String davitWeight;

    public RBPanel() {

        add(new JLabel("Weights to be loaded to the RB and used for Davit's test. (kg)"));
        add(new JLabel("________________________________"));

        setLayout(new FlowLayout(FlowLayout.CENTER));
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.yellow);

        Dimension fieleds = new Dimension(fieldWidth, fieldHight);

        add(new JLabel("Weight of the empty boat with equipment"));
        JTextField weightField = new JTextField();
        weightField.setPreferredSize(fieleds);
        add(weightField);

        add(new JLabel("No. of persons"));
        JTextField personsField = new JTextField();
        personsField.setPreferredSize(fieleds);
        add(personsField);

        add(new JLabel("________________________________"));

        add(new JLabel("Calculated weight to be loaded to RB: "));
        add(new JLabel(weightInRB));
        add(new JLabel("Calculated total load: "));
        add(new JLabel(totalWeight));
        add(new JLabel("Calculated weight to be used for Davit test: "));
        add(new JLabel(davitWeight));
    }
}