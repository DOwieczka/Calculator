import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    public static final int WIDTH  = 400;
    public static final int HEIGHT = 600;
    JButton[] numberButtons = new JButton[10];  //0, 1, 2, 3, 4, 5, 6, 7, 8, 9
    JButton[] functionButtons = new JButton[8]; //+, -, *, /, %
    JButton addButton, subButton, mulButton, divButton,
    equButton, decButton, delButton, clrButton;
    private JPanel panel;
  //  JTextField textField;
    public Calculator(){
        super("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setLocationRelativeTo(null);
        setLayout(null);
        pack();
        JTextField textField;
        textField = new JTextField();
        textField.setBounds(50,HEIGHT/24,WIDTH-100, HEIGHT/16);
        textField.setSelectedTextColor(Color.RED);
        textField.setFont(new Font("Calibre", Font.BOLD, 30));


        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        equButton = new JButton("=");
        decButton = new JButton(".");
        delButton = new JButton("Delete");
        clrButton = new JButton("Clear");

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = equButton;
        functionButtons[5] = decButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;

        for (JButton button:functionButtons) {
            button.addActionListener(this);
            button.setFocusable(false);
        }

        for (int i = 0; i < 10 ; i++){
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFocusable(false);
        }
        delButton.setBounds(50,430,145,50);
        clrButton.setBounds(205,430,145,50);

        panel = new JPanel();
        panel.setBounds(50,100,300, 300);
        panel.setLayout(new GridLayout(4,4,10,10));

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);


        add(panel);
        add(delButton);
        add(clrButton);
        add(textField);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }



}
