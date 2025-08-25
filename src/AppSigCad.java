import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class AppSigCad extends JFrame {

    public AppSigCad() {
        super();
        setTitle("Sistema de Gerenciamento de Cliente, Produtos e Fornecedores");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainContainer = new JPanel(new BorderLayout());
        setContentPane(mainContainer);

        JPanel contentContainer = new JPanel();
        contentContainer.setLayout(null);
        contentContainer.setPreferredSize(new Dimension(800, 600));
        mainContainer.add(contentContainer, BorderLayout.CENTER);

        JTabbedPane tbPanel = new JTabbedPane();
        tbPanel.setBounds(20, 10, 745, 500);
        contentContainer.add(tbPanel);

     
        JPanel pnlCliente = new JPanel(null);
        tbPanel.addTab("Cliente", pnlCliente);

        String[] colunasCliente = {"Matrícula", "Nome", "Telefone", "Email"};
        DefaultTableModel modelCliente = new DefaultTableModel(colunasCliente, 0);
        JTable tabelaCliente = new JTable(modelCliente);
        JScrollPane scrollCliente = new JScrollPane(tabelaCliente);
        scrollCliente.setBounds(30, 20, 680, 200);
        pnlCliente.add(scrollCliente);

        JLabel lblMatricula = new JLabel("Matrícula:");
        lblMatricula.setBounds(30, 250, 80, 25);
        pnlCliente.add(lblMatricula);

        JTextField txtMatricula = new JTextField();
        txtMatricula.setBounds(110, 250, 150, 25);
        txtMatricula.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        pnlCliente.add(txtMatricula);

        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(30, 290, 80, 25);
        pnlCliente.add(lblNome);

        JTextField txtNome = new JTextField();
        txtNome.setBounds(110, 290, 300, 25);
        txtNome.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        pnlCliente.add(txtNome);

        JLabel lblTelefone = new JLabel("Telefone:");
        lblTelefone.setBounds(30, 330, 80, 25);
        pnlCliente.add(lblTelefone);

        JTextField txtTelefone = new JTextField();
        txtTelefone.setBounds(110, 330, 150, 25);
        txtTelefone.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        pnlCliente.add(txtTelefone);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setBounds(30, 370, 80, 25);
        pnlCliente.add(lblEmail);

        JTextField txtEmail = new JTextField();
        txtEmail.setBounds(110, 370, 300, 25);
        txtEmail.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        pnlCliente.add(txtEmail);

        JButton btnLimparCliente = new JButton("Limpar");
        btnLimparCliente.setBounds(450, 290, 100, 30);
        pnlCliente.add(btnLimparCliente);

        JButton btnSalvarCliente = new JButton("Salvar");
        btnSalvarCliente.setBounds(450, 330, 100, 30);
        pnlCliente.add(btnSalvarCliente);

        btnLimparCliente.addActionListener(e -> {
            txtMatricula.setText("");
            txtNome.setText("");
            txtTelefone.setText("");
            txtEmail.setText("");
        });

        btnSalvarCliente.addActionListener(e -> {
            modelCliente.addRow(new Object[]{
                    txtMatricula.getText(),
                    txtNome.getText(),
                    txtTelefone.getText(),
                    txtEmail.getText()
            });
            JOptionPane.showMessageDialog(null, "Cliente salvo com sucesso!");
            txtMatricula.setText("");
            txtNome.setText("");
            txtTelefone.setText("");
            txtEmail.setText("");
        });


        JPanel pnlProduto = new JPanel(null);
        tbPanel.addTab("Produto", pnlProduto);

        String[] colunasProduto = {"Código", "Nome", "Preço"};
        DefaultTableModel modelProduto = new DefaultTableModel(colunasProduto, 0);
        JTable tabelaProduto = new JTable(modelProduto);
        JScrollPane scrollProduto = new JScrollPane(tabelaProduto);
        scrollProduto.setBounds(30, 20, 680, 200);
        pnlProduto.add(scrollProduto);

        JLabel lblCodigoProduto = new JLabel("Código:");
        lblCodigoProduto.setBounds(30, 250, 80, 25);
        pnlProduto.add(lblCodigoProduto);

        JTextField txtCodigoProduto = new JTextField();
        txtCodigoProduto.setBounds(110, 250, 150, 25);
        txtCodigoProduto.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        pnlProduto.add(txtCodigoProduto);

        JLabel lblNomeProduto = new JLabel("Nome:");
        lblNomeProduto.setBounds(30, 290, 80, 25);
        pnlProduto.add(lblNomeProduto);

        JTextField txtNomeProduto = new JTextField();
        txtNomeProduto.setBounds(110, 290, 300, 25);
        txtNomeProduto.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        pnlProduto.add(txtNomeProduto);

        JLabel lblPrecoProduto = new JLabel("Preço:");
        lblPrecoProduto.setBounds(30, 330, 80, 25);
        pnlProduto.add(lblPrecoProduto);

        JTextField txtPrecoProduto = new JTextField();
        txtPrecoProduto.setBounds(110, 330, 150, 25);
        txtPrecoProduto.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        pnlProduto.add(txtPrecoProduto);

        JButton btnLimparProduto = new JButton("Limpar");
        btnLimparProduto.setBounds(450, 290, 100, 30);
        pnlProduto.add(btnLimparProduto);

        JButton btnSalvarProduto = new JButton("Salvar");
        btnSalvarProduto.setBounds(450, 330, 100, 30);
        pnlProduto.add(btnSalvarProduto);

        btnLimparProduto.addActionListener(e -> {
            txtCodigoProduto.setText("");
            txtNomeProduto.setText("");
            txtPrecoProduto.setText("");
        });

        btnSalvarProduto.addActionListener(e -> {
            modelProduto.addRow(new Object[]{
                    txtCodigoProduto.getText(),
                    txtNomeProduto.getText(),
                    txtPrecoProduto.getText()
            });
            JOptionPane.showMessageDialog(null, "Produto salvo com sucesso!");
            txtCodigoProduto.setText("");
            txtNomeProduto.setText("");
            txtPrecoProduto.setText("");
        });

        JPanel pnlFornecedor = new JPanel(null);
        tbPanel.addTab("Fornecedor", pnlFornecedor);

        String[] colunasFornecedor = {"CNPJ", "Nome", "Contato"};
        DefaultTableModel modelFornecedor = new DefaultTableModel(colunasFornecedor, 0);
        JTable tabelaFornecedor = new JTable(modelFornecedor);
        JScrollPane scrollFornecedor = new JScrollPane(tabelaFornecedor);
        scrollFornecedor.setBounds(30, 20, 680, 200);
        pnlFornecedor.add(scrollFornecedor);

        JLabel lblCNPJ = new JLabel("CNPJ:");
        lblCNPJ.setBounds(30, 250, 80, 25);
        pnlFornecedor.add(lblCNPJ);

        JTextField txtCNPJ = new JTextField();
        txtCNPJ.setBounds(110, 250, 200, 25);
        txtCNPJ.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        pnlFornecedor.add(txtCNPJ);

        JLabel lblNomeFornecedor = new JLabel("Nome:");
        lblNomeFornecedor.setBounds(30, 290, 80, 25);
        pnlFornecedor.add(lblNomeFornecedor);

        JTextField txtNomeFornecedor = new JTextField();
        txtNomeFornecedor.setBounds(110, 290, 300, 25);
        txtNomeFornecedor.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        pnlFornecedor.add(txtNomeFornecedor);

        JLabel lblContato = new JLabel("Contato:");
        lblContato.setBounds(30, 330, 80, 25);
        pnlFornecedor.add(lblContato);

        JTextField txtContato = new JTextField();
        txtContato.setBounds(110, 330, 200, 25);
        txtContato.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        pnlFornecedor.add(txtContato);

        JButton btnLimparFornecedor = new JButton("Limpar");
        btnLimparFornecedor.setBounds(450, 290, 100, 30);
        pnlFornecedor.add(btnLimparFornecedor);

        JButton btnSalvarFornecedor = new JButton("Salvar");
        btnSalvarFornecedor.setBounds(450, 330, 100, 30);
        pnlFornecedor.add(btnSalvarFornecedor);

        btnLimparFornecedor.addActionListener(e -> {
            txtCNPJ.setText("");
            txtNomeFornecedor.setText("");
            txtContato.setText("");
        });

        btnSalvarFornecedor.addActionListener(e -> {
            modelFornecedor.addRow(new Object[]{
                    txtCNPJ.getText(),
                    txtNomeFornecedor.getText(),
                    txtContato.getText()
            });
            JOptionPane.showMessageDialog(null, "Fornecedor salvo com sucesso!");
            txtCNPJ.setText("");
            txtNomeFornecedor.setText("");
            txtContato.setText("");
        });

        setVisible(true); // Exibe a janela
    }

    public static void main(String[] args) {
        new AppSigCad(); // Inicia o programa
    }
}