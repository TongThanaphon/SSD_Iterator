import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame {

    private JLabel labelName;
    private JTextField inputId;
    private JButton buttonSearch;

    public App(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        labelName = new JLabel("", SwingConstants.CENTER);
        labelName.setPreferredSize(new Dimension(100, 30));

        inputId = new JTextField();
        inputId.setPreferredSize(new Dimension(100, 30));

        buttonSearch = new JButton("Search");
        buttonSearch.setPreferredSize(new Dimension(100, 30));
        buttonSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int id = Integer.parseInt(inputId.getText());
                User user = DbManager.getInstance().findUser(id);
                labelName.setText(user.getName());
            }
        });

        add(labelName);
        add(inputId);
        add(buttonSearch);
        pack();
    }

    public static void main(String[] args) {
        App app = new App();
        app.setVisible(true);
    }

}
