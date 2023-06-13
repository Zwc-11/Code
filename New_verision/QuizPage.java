package Version_1;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuizPage extends JFrame {
    private JTextField answerField;
    private JLabel questionCountLabel;
    private JLabel correctCountLabel;
    private JTable resultTable;

    public QuizPage() {
        setTitle("Quiz Page");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());
        Border blackBorder = BorderFactory.createLineBorder(Color.BLACK);
        Border emptyBorder = new EmptyBorder(50, 20, 20, 20); // Add space around the top panel
        Border compoundBorder = BorderFactory.createCompoundBorder(blackBorder, emptyBorder);
        topPanel.setBorder(compoundBorder);
        topPanel.setPreferredSize(new Dimension(topPanel.getPreferredSize().width, 500)); // Increase the height of the
                                                                                          // top panel
        add(topPanel, BorderLayout.NORTH);

        JLabel questionLabel = new JLabel("Question: What is friction?");
        topPanel.add(questionLabel, BorderLayout.NORTH);

        answerField = new JTextField();
        topPanel.add(answerField, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new BorderLayout());
        add(bottomPanel, BorderLayout.SOUTH);

        questionCountLabel = new JLabel("Questions Answered: 0");
        bottomPanel.add(questionCountLabel, BorderLayout.WEST);

        JButton submitButton = new JButton("Submit Quiz");
        bottomPanel.add(submitButton, BorderLayout.EAST);

        correctCountLabel = new JLabel("Correct Answers: 0");
        add(correctCountLabel, BorderLayout.CENTER);

        String[] columnNames = { "Question", "Correct", "Your Answer", "Correct Answer" };
        String[][] data = { { "Question 1", "Yes", "No", "Yes" },
                { "Question 2", "No", "No", "Yes" },
                { "Question 3", "Yes", "Yes", "Yes" } };

        resultTable = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(resultTable);
        add(scrollPane, BorderLayout.SOUTH);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add your logic here for handling the submit button action
                // For example, you can check the answers and update the result table and labels
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                QuizPage quizPage = new QuizPage();
                quizPage.setVisible(true);
            }
        });
    }
}
