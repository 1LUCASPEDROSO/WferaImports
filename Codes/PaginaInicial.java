package Codes;

public class PaginaInicial extends javax.swing.JFrame {

    public PaginaInicial() {
        initComponents();
        PaginaInicial frame = new PaginaInicial();
    frame.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PainelNavBar = new javax.swing.JPanel();
        BtHamburguer = new javax.swing.JButton();
        BtPesquisar = new javax.swing.JButton();
        TextPesquisa = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        PainelProdutos = new javax.swing.JPanel();
        ImagenCamiseta1 = new javax.swing.JLabel();
        DescCamiseta1 = new javax.swing.JLabel();
        LabelPreçoCamiseta1 = new javax.swing.JLabel();
        ImagenCamiseta2 = new javax.swing.JLabel();
        DescCamiseta2 = new javax.swing.JLabel();
        LabelPreçoCamiseta2 = new javax.swing.JLabel();
        ImagenCamiseta3 = new javax.swing.JLabel();
        DescCamiseta3 = new javax.swing.JLabel();
        LabelPreçoCamiseta3 = new javax.swing.JLabel();
        ImagenCamiseta4 = new javax.swing.JLabel();
        DescCamiseta4 = new javax.swing.JLabel();
        LabelPreçoCamiseta4 = new javax.swing.JLabel();
        BtComprarAgoraCamiseta1 = new javax.swing.JButton();
        BtComprarAgoraCamiseta2 = new javax.swing.JButton();
        BtComprarAgoraCamiseta3 = new javax.swing.JButton();
        BtComprarAgoraCamiseta4 = new javax.swing.JButton();
        PainelNavBar1 = new javax.swing.JPanel();
        BTwpp = new javax.swing.JButton();
        BTInsta = new javax.swing.JButton();
        BTConjuntos = new javax.swing.JButton();
        BTSeleções = new javax.swing.JButton();
        BTTimes = new javax.swing.JButton();
        BTCamisetasDeTime = new javax.swing.JButton();
        LabelCategoria = new javax.swing.JLabel();
        BTQuemSomosNos = new javax.swing.JButton();
        BTduvidas = new javax.swing.JButton();
        BTRastrearPedido = new javax.swing.JButton();
        BTTermosDeerviço = new javax.swing.JButton();
        LabelInformações = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(671, 665));

        PainelNavBar.setBackground(new java.awt.Color(115, 115, 115));

        BtHamburguer.setBackground(new java.awt.Color(115, 115, 115));
        BtHamburguer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menuHam.png"))); // NOI18N

        BtPesquisar.setBackground(new java.awt.Color(115, 115, 115));
        BtPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lupinha.png"))); // NOI18N
        BtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtPesquisarActionPerformed(evt);
            }
        });

        TextPesquisa.setBackground(new java.awt.Color(255, 255, 255));
        TextPesquisa.setForeground(new java.awt.Color(0, 0, 0));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/carrinho.png"))); // NOI18N

        jButton4.setText("Login");

        javax.swing.GroupLayout PainelNavBarLayout = new javax.swing.GroupLayout(PainelNavBar);
        PainelNavBar.setLayout(PainelNavBarLayout);
        PainelNavBarLayout.setHorizontalGroup(
            PainelNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelNavBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtHamburguer)
                .addGap(24, 24, 24)
                .addComponent(TextPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addGap(14, 14, 14))
        );
        PainelNavBarLayout.setVerticalGroup(
            PainelNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelNavBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtPesquisar, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PainelNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(TextPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtHamburguer)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/camiseta3.jpeg"))); // NOI18N

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButton5.setText(">");
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButton6.setText("<");
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        PainelProdutos.setBackground(new java.awt.Color(255, 255, 255));

        ImagenCamiseta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/camiseta2.jpeg"))); // NOI18N

        DescCamiseta1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DescCamiseta1.setForeground(new java.awt.Color(0, 0, 0));
        DescCamiseta1.setText("conjunto Futebol Inverno");

        LabelPreçoCamiseta1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelPreçoCamiseta1.setForeground(new java.awt.Color(255, 0, 0));
        LabelPreçoCamiseta1.setText("R$: 249,90");

        ImagenCamiseta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/camiseta1.jpeg"))); // NOI18N

        DescCamiseta2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DescCamiseta2.setForeground(new java.awt.Color(0, 0, 0));
        DescCamiseta2.setText("conjunto Futebol Inverno");

        LabelPreçoCamiseta2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelPreçoCamiseta2.setForeground(new java.awt.Color(255, 0, 0));
        LabelPreçoCamiseta2.setText("R$: 249,90");

        ImagenCamiseta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/camiseta4.jpeg"))); // NOI18N

        DescCamiseta3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DescCamiseta3.setForeground(new java.awt.Color(0, 0, 0));
        DescCamiseta3.setText("conjunto Futebol Inverno");

        LabelPreçoCamiseta3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelPreçoCamiseta3.setForeground(new java.awt.Color(255, 0, 0));
        LabelPreçoCamiseta3.setText("R$: 249,90");

        ImagenCamiseta4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/camiseta8.jpeg"))); // NOI18N

        DescCamiseta4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DescCamiseta4.setForeground(new java.awt.Color(0, 0, 0));
        DescCamiseta4.setText("conjunto Futebol Inverno");

        LabelPreçoCamiseta4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelPreçoCamiseta4.setForeground(new java.awt.Color(255, 0, 0));
        LabelPreçoCamiseta4.setText("R$: 249,90");

        BtComprarAgoraCamiseta1.setBackground(new java.awt.Color(255, 51, 51));
        BtComprarAgoraCamiseta1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtComprarAgoraCamiseta1.setForeground(new java.awt.Color(255, 255, 255));
        BtComprarAgoraCamiseta1.setText("Comprar Agora");

        BtComprarAgoraCamiseta2.setBackground(new java.awt.Color(255, 51, 51));
        BtComprarAgoraCamiseta2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtComprarAgoraCamiseta2.setForeground(new java.awt.Color(255, 255, 255));
        BtComprarAgoraCamiseta2.setText("Comprar Agora");
        BtComprarAgoraCamiseta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtComprarAgoraCamiseta2ActionPerformed(evt);
            }
        });

        BtComprarAgoraCamiseta3.setBackground(new java.awt.Color(255, 51, 51));
        BtComprarAgoraCamiseta3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtComprarAgoraCamiseta3.setForeground(new java.awt.Color(255, 255, 255));
        BtComprarAgoraCamiseta3.setText("Comprar Agora");

        BtComprarAgoraCamiseta4.setBackground(new java.awt.Color(255, 51, 51));
        BtComprarAgoraCamiseta4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtComprarAgoraCamiseta4.setForeground(new java.awt.Color(255, 255, 255));
        BtComprarAgoraCamiseta4.setText("Comprar Agora");

        javax.swing.GroupLayout PainelProdutosLayout = new javax.swing.GroupLayout(PainelProdutos);
        PainelProdutos.setLayout(PainelProdutosLayout);
        PainelProdutosLayout.setHorizontalGroup(
            PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelProdutosLayout.createSequentialGroup()
                .addGroup(PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelProdutosLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ImagenCamiseta1)
                            .addGroup(PainelProdutosLayout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(LabelPreçoCamiseta1))
                            .addGroup(PainelProdutosLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(DescCamiseta1))))
                    .addGroup(PainelProdutosLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(BtComprarAgoraCamiseta2)))
                .addGap(58, 58, 58)
                .addGroup(PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImagenCamiseta2)
                    .addGroup(PainelProdutosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DescCamiseta2)
                            .addGroup(PainelProdutosLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(LabelPreçoCamiseta2))))
                    .addGroup(PainelProdutosLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(BtComprarAgoraCamiseta1)))
                .addGroup(PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelProdutosLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(ImagenCamiseta3, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelProdutosLayout.createSequentialGroup()
                        .addGroup(PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelProdutosLayout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(LabelPreçoCamiseta3))
                            .addGroup(PainelProdutosLayout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(DescCamiseta3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelProdutosLayout.createSequentialGroup()
                                .addComponent(BtComprarAgoraCamiseta3)
                                .addGap(23, 23, 23)))
                        .addGap(126, 126, 126)))
                .addGroup(PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelProdutosLayout.createSequentialGroup()
                        .addComponent(ImagenCamiseta4)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelProdutosLayout.createSequentialGroup()
                        .addComponent(DescCamiseta4)
                        .addGap(118, 118, 118))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelProdutosLayout.createSequentialGroup()
                        .addComponent(LabelPreçoCamiseta4)
                        .addGap(171, 171, 171))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelProdutosLayout.createSequentialGroup()
                        .addComponent(BtComprarAgoraCamiseta4)
                        .addGap(137, 137, 137))))
        );
        PainelProdutosLayout.setVerticalGroup(
            PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelProdutosLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelProdutosLayout.createSequentialGroup()
                        .addComponent(ImagenCamiseta2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(DescCamiseta2)
                        .addGap(18, 18, 18)
                        .addComponent(LabelPreçoCamiseta2)
                        .addGap(18, 18, 18)
                        .addComponent(BtComprarAgoraCamiseta1))
                    .addGroup(PainelProdutosLayout.createSequentialGroup()
                        .addGroup(PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelProdutosLayout.createSequentialGroup()
                                .addComponent(ImagenCamiseta1)
                                .addGap(18, 18, 18)
                                .addComponent(DescCamiseta1)
                                .addGap(18, 18, 18)
                                .addComponent(LabelPreçoCamiseta1))
                            .addGroup(PainelProdutosLayout.createSequentialGroup()
                                .addGroup(PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ImagenCamiseta4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, Short.MAX_VALUE)
                                    .addComponent(ImagenCamiseta3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(DescCamiseta3)
                                    .addComponent(DescCamiseta4))
                                .addGap(18, 18, 18)
                                .addGroup(PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LabelPreçoCamiseta3)
                                    .addComponent(LabelPreçoCamiseta4))))
                        .addGap(18, 18, 18)
                        .addGroup(PainelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtComprarAgoraCamiseta3)
                            .addComponent(BtComprarAgoraCamiseta4)
                            .addComponent(BtComprarAgoraCamiseta2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        PainelNavBar1.setBackground(new java.awt.Color(115, 115, 115));

        BTwpp.setBackground(new java.awt.Color(115, 115, 115));
        BTwpp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wsp.png"))); // NOI18N

        BTInsta.setBackground(new java.awt.Color(115, 115, 115));
        BTInsta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/instagram.png"))); // NOI18N

        BTConjuntos.setText("Conjuntos");

        BTSeleções.setText("seleções");

        BTTimes.setText("Times");

        BTCamisetasDeTime.setText("Camisetas de Time");

        LabelCategoria.setText("Categorias");

        BTQuemSomosNos.setText("Quem somos");

        BTduvidas.setText("Duvídas");

        BTRastrearPedido.setText("Rastrear Pedido");

        BTTermosDeerviço.setText("Termos de Serviço");

        LabelInformações.setText("Informações");

        javax.swing.GroupLayout PainelNavBar1Layout = new javax.swing.GroupLayout(PainelNavBar1);
        PainelNavBar1.setLayout(PainelNavBar1Layout);
        PainelNavBar1Layout.setHorizontalGroup(
            PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelNavBar1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelNavBar1Layout.createSequentialGroup()
                        .addComponent(LabelCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1104, Short.MAX_VALUE)
                        .addComponent(LabelInformações)
                        .addGap(173, 173, 173)
                        .addComponent(BTInsta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTwpp)
                        .addGap(22, 22, 22))
                    .addGroup(PainelNavBar1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BTduvidas)
                        .addGap(192, 192, 192))
                    .addGroup(PainelNavBar1Layout.createSequentialGroup()
                        .addComponent(BTConjuntos)
                        .addGap(18, 18, 18)
                        .addComponent(BTSeleções)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTQuemSomosNos)
                        .addGap(296, 296, 296))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelNavBar1Layout.createSequentialGroup()
                        .addComponent(BTCamisetasDeTime)
                        .addGap(18, 18, 18)
                        .addComponent(BTTimes)
                        .addGap(865, 865, 865)
                        .addComponent(BTRastrearPedido)
                        .addGap(18, 18, 18)
                        .addComponent(BTTermosDeerviço)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        PainelNavBar1Layout.setVerticalGroup(
            PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelNavBar1Layout.createSequentialGroup()
                .addGroup(PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelNavBar1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(BTInsta)
                                .addComponent(BTwpp))
                            .addComponent(LabelCategoria)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelNavBar1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LabelInformações)))
                .addGroup(PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelNavBar1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTConjuntos)
                            .addComponent(BTSeleções))
                        .addGap(18, 18, 18)
                        .addGroup(PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTCamisetasDeTime)
                            .addComponent(BTTimes)))
                    .addGroup(PainelNavBar1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTQuemSomosNos)
                            .addComponent(BTduvidas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PainelNavBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTRastrearPedido)
                            .addComponent(BTTermosDeerviço))))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(441, 441, 441)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(PainelNavBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(PainelNavBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(PainelNavBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54)
                .addComponent(PainelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelNavBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1440, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 955, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtPesquisarActionPerformed

    private void BtComprarAgoraCamiseta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtComprarAgoraCamiseta2ActionPerformed
        
    }//GEN-LAST:event_BtComprarAgoraCamiseta2ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTCamisetasDeTime;
    private javax.swing.JButton BTConjuntos;
    private javax.swing.JButton BTInsta;
    private javax.swing.JButton BTQuemSomosNos;
    private javax.swing.JButton BTRastrearPedido;
    private javax.swing.JButton BTSeleções;
    private javax.swing.JButton BTTermosDeerviço;
    private javax.swing.JButton BTTimes;
    private javax.swing.JButton BTduvidas;
    private javax.swing.JButton BTwpp;
    private javax.swing.JButton BtComprarAgoraCamiseta1;
    private javax.swing.JButton BtComprarAgoraCamiseta2;
    private javax.swing.JButton BtComprarAgoraCamiseta3;
    private javax.swing.JButton BtComprarAgoraCamiseta4;
    private javax.swing.JButton BtHamburguer;
    private javax.swing.JButton BtPesquisar;
    private javax.swing.JLabel DescCamiseta1;
    private javax.swing.JLabel DescCamiseta2;
    private javax.swing.JLabel DescCamiseta3;
    private javax.swing.JLabel DescCamiseta4;
    private javax.swing.JLabel ImagenCamiseta1;
    private javax.swing.JLabel ImagenCamiseta2;
    private javax.swing.JLabel ImagenCamiseta3;
    private javax.swing.JLabel ImagenCamiseta4;
    private javax.swing.JLabel LabelCategoria;
    private javax.swing.JLabel LabelInformações;
    private javax.swing.JLabel LabelPreçoCamiseta1;
    private javax.swing.JLabel LabelPreçoCamiseta2;
    private javax.swing.JLabel LabelPreçoCamiseta3;
    private javax.swing.JLabel LabelPreçoCamiseta4;
    private javax.swing.JPanel PainelNavBar;
    private javax.swing.JPanel PainelNavBar1;
    private javax.swing.JPanel PainelProdutos;
    private javax.swing.JTextField TextPesquisa;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
