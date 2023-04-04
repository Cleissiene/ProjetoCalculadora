import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame implements ActionListener {
    private JTextField resultadoField;
    private JButton botaoAdicao, botaoSubtracao, botaoMultiplacacao, botaoDivisao, botaoIgual;
    private double num1, num2;
    private String operacao;

    public Calculadora() {
        setTitle("Calculator");
        setSize(300, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        resultadoField = new JTextField();
        resultadoField.setEditable(false);
        add(resultadoField, BorderLayout.NORTH);

        JPanel botoesPanel = new JPanel();
        botoesPanel.setLayout(new GridLayout(4, 4));

        JButton botao7 = new JButton(Integer.toString(7));
        botao7.addActionListener(this);
        botoesPanel.add(botao7);

        JButton botao8 = new JButton(Integer.toString(8));
        botao8.addActionListener(this);
        botoesPanel.add(botao8);

        JButton botao9 = new JButton(Integer.toString(9));
        botao9.addActionListener(this);
        botoesPanel.add(botao9);

        botaoDivisao = new JButton("/");
        botaoDivisao.addActionListener(this);
        botoesPanel.add(botaoDivisao);

        JButton botao4 = new JButton(Integer.toString(4));
        botao4.addActionListener(this);
        botoesPanel.add(botao4);

        JButton botao5 = new JButton(Integer.toString(5));
        botao5.addActionListener(this);
        botoesPanel.add(botao5);

        JButton botao6 = new JButton(Integer.toString(6));
        botao6.addActionListener(this);
        botoesPanel.add(botao6);

        botaoMultiplacacao = new JButton("*");
        botaoMultiplacacao.addActionListener(this);
        botoesPanel.add(botaoMultiplacacao);

        JButton botao1 = new JButton(Integer.toString(1));
        botao1.addActionListener(this);
        botoesPanel.add(botao1);

        JButton botao2 = new JButton(Integer.toString(2));
        botao2.addActionListener(this);
        botoesPanel.add(botao2);

        JButton botao3 = new JButton(Integer.toString(3));
        botao3.addActionListener(this);
        botoesPanel.add(botao3);

        JButton botaoSubtracao = new JButton("-");
        botaoSubtracao.addActionListener(this);
        botoesPanel.add(botaoSubtracao);

        JButton botao0 = new JButton(Integer.toString(0));
        botao0.addActionListener(this);
        botoesPanel.add(botao0);

        JButton botaoPonto = new JButton(".");
        botaoPonto.addActionListener(this);
        botoesPanel.add(botaoPonto);

        JButton botaoIgual = new JButton("=");
        botaoIgual.addActionListener(this);
        botoesPanel.add(botaoIgual);

        JButton botaoAdicao = new JButton("+");
        botaoAdicao.addActionListener(this);
        botoesPanel.add(botaoAdicao);

        add(botoesPanel, BorderLayout.CENTER);

        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent event) {

        String textoBotao = event.getActionCommand();
        if (textoBotao.equals("+")) {
            num1 = Double.parseDouble(resultadoField.getText());
            operacao = "+";
            resultadoField.setText("");
        } else if (textoBotao.equals("-")) {
            num1 = Double.parseDouble(resultadoField.getText());
            operacao = "-";
            resultadoField.setText("");
        } else if (textoBotao.equals("*")) {
            num1 = Double.parseDouble(resultadoField.getText());
            operacao = "*";
            resultadoField.setText("");
        } else if (textoBotao.equals("/")) {
            num1 = Double.parseDouble(resultadoField.getText());
            operacao = "/";
            resultadoField.setText("");
        } else if (textoBotao.equals("=")) {
            num2 = Double.parseDouble((resultadoField.getText()));
            if (operacao.equals("+")) {
                resultadoField.setText(Double.toString(num1 + num2));
            } else if (operacao.equals("-")) {
                resultadoField.setText(Double.toString(num1 - num2));
            } else if (operacao.equals("*")) {
                resultadoField.setText(Double.toString(num1 * num2));
            } else if (operacao.equals("/")) {
                if (num2 == 0) {
                    resultadoField.setText("Erro: divisão por zero");
                } else {
                    resultadoField.setText(Double.toString(num1 / num2));
                }

            }

        } else {
            resultadoField.setText(resultadoField.getText() + textoBotao);
        }
    }

    public static void main(String[] args) {
        new Calculadora();
    }
}

