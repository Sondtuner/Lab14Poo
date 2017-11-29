package view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by igor on 29/11/17.
 */
public class Loading extends JPanel{
        private JLabel loadinglb;

        private JButton entrar;

        public Loading(Color backGroundColour, final TelaPrincipal telaPrincipal){
            loadinglb = new JLabel("Loading: ");

            entrar = new JButton("Entrar");

            add(loadinglb);
            

        }


}
