package com.javatpoint;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JApps extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JApps frame = new JApps();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JApps() {
		setTitle("KID'S LEARNING PORTAL");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 771);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Notepad.main(new String[]{});
			}
		});
		btnNewButton.setIcon(new ImageIcon(JApps.class.getResource("/com/javatpoint/notepad.jpg")));
		
		JLabel lblJavaApplicationWorld = new JLabel("KID'S LEARNING PORTAL");
		lblJavaApplicationWorld.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblJavaApplicationWorld.setForeground(new Color(204, 51, 51));
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyCalculator.main(new String[]{});
			}
		});
		button.setIcon(new ImageIcon(JApps.class.getResource("/com/javatpoint/calculator.jpg")));
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IPFinder.main(new String[]{});
			}
		});
		button_1.setIcon(new ImageIcon(JApps.class.getResource("/com/javatpoint/tictactoe.jpg")));

		
		JButton button_2 = new JButton("");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CharCount.main(new String[]{});
			}
		});
		button_3.setIcon(new ImageIcon(JApps.class.getResource("/com/javatpoint/wct.jpg")));
		
		JButton button_4 = new JButton("");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Puzzle.main(new String[]{});
			}
		});
		button_4.setIcon(new ImageIcon(JApps.class.getResource("/com/javatpoint/Puzzle Game.jpg")));
		
		JButton button_5 = new JButton("");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OnlineTest.main(new String[]{});
			}
		});
		button_5.setIcon(new ImageIcon(JApps.class.getResource("/com/javatpoint/Exam System.jpg")));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(186)
							.addComponent(lblJavaApplicationWorld))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
import java.awt.*;
import java.awt.event.*;
/***************/

class MyCalculator extends Frame
{

    public boolean setClear=true;
    double number, memValue;
    char op;

    String digitButtonText[] = {"7", "8", "9", "4", "5", "6", "1", "2", "3", "0", "+/-", "." };
    String operatorButtonText[] = {"/", "sqrt", "*", "%", "-", "1/X", "+", "=" };
    String memoryButtonText[] = {"MC", "MR", "MS", "M+" };
    String specialButtonText[] = {"Backspc", "C", "CE" };

    MyDigitButton digitButton[]=new MyDigitButton[digitButtonText.length];
    MyOperatorButton operatorButton[]=new MyOperatorButton[operatorButtonText.length];
    MyMemoryButton memoryButton[]=new MyMemoryButton[memoryButtonText.length];
    MySpecialButton specialButton[]=new MySpecialButton[specialButtonText.length];

    Label displayLabel=new Label("0",Label.RIGHT);
    Label memLabel=new Label(" ",Label.RIGHT);

    final int FRAME_WIDTH=325,FRAME_HEIGHT=325;
    final int HEIGHT=30, WIDTH=30, H_SPACE=10,V_SPACE=10;
    final int TOPX=30, TOPY=50;
    ///////////////////////////
    MyCalculator(String frameText)//constructor
    {
        super(frameText);

        int tempX=TOPX, y=TOPY;
        displayLabel.setBounds(tempX,y,240,HEIGHT);
        displayLabel.setBackground(Color.BLUE);
        displayLabel.setForeground(Color.WHITE);
        add(displayLabel);

        memLabel.setBounds(TOPX,  TOPY+HEIGHT+ V_SPACE,WIDTH, HEIGHT);
        add(memLabel);

// set Co-ordinates for Memory Buttons
        tempX=TOPX;
        y=TOPY+2*(HEIGHT+V_SPACE);
        for(int i=0; i<memoryButton.length; i++)
        {
            memoryButton[i]=new MyMemoryButton(tempX,y,WIDTH,HEIGHT,memoryButtonText[i], this);
            memoryButton[i].setForeground(Color.RED);
            y+=HEIGHT+V_SPACE;
        }

//set Co-ordinates for Special Buttons
        tempX=TOPX+1*(WIDTH+H_SPACE); y=TOPY+1*(HEIGHT+V_SPACE);
        for(int i=0;i<specialButton.length;i++)
        {
            specialButton[i]=new MySpecialButton(tempX,y,WIDTH*2,HEIGHT,specialButtonText[i], this);
            specialButton[i].setForeground(Color.RED);
            tempX=tempX+2*WIDTH+H_SPACE;
        }

//set Co-ordinates for Digit Buttons
        int digitX=TOPX+WIDTH+H_SPACE;
        int digitY=TOPY+2*(HEIGHT+V_SPACE);
        tempX=digitX;  y=digitY;
        for(int i=0;i<digitButton.length;i++)
        {
            digitButton[i]=new MyDigitButton(tempX,y,WIDTH,HEIGHT,digitButtonText[i], this);
            digitButton[i].setForeground(Color.BLUE);
            tempX+=WIDTH+H_SPACE;
            if((i+1)%3==0){tempX=digitX; y+=HEIGHT+V_SPACE;}
        }

//set Co-ordinates for Operator Buttons
        int opsX=digitX+2*(WIDTH+H_SPACE)+H_SPACE;
        int opsY=digitY;
        tempX=opsX;  y=opsY;
        for(int i=0;i<operatorButton.length;i++)
        {
            tempX+=WIDTH+H_SPACE;
            operatorButton[i]=new MyOperatorButton(tempX,y,WIDTH,HEIGHT,operatorButtonText[i], this);
            operatorButton[i].setForeground(Color.RED);
            if((i+1)%2==0){tempX=opsX; y+=HEIGHT+V_SPACE;}
        }

        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent ev)
            {System.exit(0);}
        });

        setLayout(null);
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setVisible(true);
    }
    //////////////////////////////////
    static String getFormattedText(double temp)
    {
        String resText=""+temp;
        if(resText.lastIndexOf(".0")>0)
            resText=resText.substring(0,resText.length()-2);
        return resText;
    }
    ////////////////////////////////////////
    public static void main(String []args)
    {
        new MyCalculator("Calculator - JavaTpoint");
    }
}

/***************/

class MyDigitButton extends Button implements ActionListener
{
    MyCalculator cl;

    //////////////////////////////////////////
    MyDigitButton(int x,int y, int width,int height,String cap, MyCalculator clc)
    {
        super(cap);
        setBounds(x,y,width,height);
        this.cl=clc;
        this.cl.add(this);
        addActionListener(this);
    }
    ////////////////////////////////////////////////
    static boolean isInString(String s, char ch)
    {
        for(int i=0; i<s.length();i++) if(s.charAt(i)==ch) return true;
        return false;
    }
    /////////////////////////////////////////////////
    public void actionPerformed(ActionEvent ev)
    {
        String tempText=((MyDigitButton)ev.getSource()).getLabel();

        if(tempText.equals("."))
        {
            if(cl.setClear)
            {cl.displayLabel.setText("0.");cl.setClear=false;}
            else if(!isInString(cl.displayLabel.getText(),'.'))
                cl.displayLabel.setText(cl.displayLabel.getText()+".");
            return;
        }

        int index=0;
        try{
            index=Integer.parseInt(tempText);
        }catch(NumberFormatException e){return;}

        if (index==0 && cl.displayLabel.getText().equals("0")) return;

        if(cl.setClear)
        {cl.displayLabel.setText(""+index);cl.setClear=false;}
        else
            cl.displayLabel.setText(cl.displayLabel.getText()+index);
    }//actionPerformed
}//class defination

/****************/

class MyOperatorButton extends Button implements ActionListener
{
    MyCalculator cl;

    MyOperatorButton(int x,int y, int width,int height,String cap, MyCalculator clc)
    {
        super(cap);
        setBounds(x,y,width,height);
        this.cl=clc;
        this.cl.add(this);
        addActionListener(this);
    }
    ///////////////////////
    public void actionPerformed(ActionEvent ev)
    {
        String opText=((MyOperatorButton)ev.getSource()).getLabel();

        cl.setClear=true;
        double temp=Double.parseDouble(cl.displayLabel.getText());

        if(opText.equals("1/x"))
        {
            try
            {double tempd=1/(double)temp;
                cl.displayLabel.setText(MyCalculator.getFormattedText(tempd));}
            catch(ArithmeticException excp)
            {cl.displayLabel.setText("Divide by 0.");}
            return;
        }
        if(opText.equals("sqrt"))
        {
            try
            {double tempd=Math.sqrt(temp);
                cl.displayLabel.setText(MyCalculator.getFormattedText(tempd));}
            catch(ArithmeticException excp)
            {cl.displayLabel.setText("Divide by 0.");}
            return;
        }
        if(!opText.equals("="))
        {
            cl.number=temp;
            cl.op=opText.charAt(0);
            return;
        }
// process = button pressed
        switch(cl.op)
        {
            case '+':
                temp+=cl.number;break;
            case '-':
                temp=cl.number-temp;break;
            case '*':
                temp*=cl.number;break;
            case '%':
                try{temp=cl.number%temp;}
                catch(ArithmeticException excp)
                {cl.displayLabel.setText("Divide by 0."); return;}
                break;
            case '/':
                try{temp=cl.number/temp;}
                catch(ArithmeticException excp)
                {cl.displayLabel.setText("Divide by 0."); return;}
                break;
        }//switch

        cl.displayLabel.setText(MyCalculator.getFormattedText(temp));
//cl.number=temp;
    }//actionPerformed
}//class

/**************/

class MyMemoryButton extends Button implements ActionListener
{
    MyCalculator cl;

    /////////////////////////////////
    MyMemoryButton(int x,int y, int width,int height,String cap, MyCalculator clc)
    {
        super(cap);
        setBounds(x,y,width,height);
        this.cl=clc;
        this.cl.add(this);
        addActionListener(this);
    }
    ////////////////////////////////////////////////
    public void actionPerformed(ActionEvent ev)
    {
        char memop=((MyMemoryButton)ev.getSource()).getLabel().charAt(1);

        cl.setClear=true;
        double temp=Double.parseDouble(cl.displayLabel.getText());

        switch(memop)
        {
            case 'C':
                cl.memLabel.setText(" ");cl.memValue=0.0;break;
            case 'R':
                cl.displayLabel.setText(MyCalculator.getFormattedText(cl.memValue));break;
            case 'S':
                cl.memValue=0.0;
            case '+':
                cl.memValue+=Double.parseDouble(cl.displayLabel.getText());
                if(cl.displayLabel.getText().equals("0") || cl.displayLabel.getText().equals("0.0")  )
                    cl.memLabel.setText(" ");
                else
                    cl.memLabel.setText("M");
                break;
        }//switch
    }//actionPerformed
}//class

/***************/

class MySpecialButton extends Button implements ActionListener
{
    MyCalculator cl;

    MySpecialButton(int x,int y, int width,int height,String cap, MyCalculator clc)
    {
        super(cap);
        setBounds(x,y,width,height);
        this.cl=clc;
        this.cl.add(this);
        addActionListener(this);
    }
    //////////////////////
    static String backSpace(String s)
    {
        String Res="";
        for(int i=0; i<s.length()-1; i++) Res+=s.charAt(i);
        return Res;
    }

    //////////////////////////////////////////////////////////
    public void actionPerformed(ActionEvent ev)
    {
        String opText=((MySpecialButton)ev.getSource()).getLabel();
//check for backspace button
        if(opText.equals("Backspc"))
        {
            String tempText=backSpace(cl.displayLabel.getText());
            if(tempText.equals(""))
                cl.displayLabel.setText("0");
            else
                cl.displayLabel.setText(tempText);
            return;
        }
//check for "C" button i.e. Reset
        if(opText.equals("C"))
        {
            cl.number=0.0; cl.op=' '; cl.memValue=0.0;
            cl.memLabel.setText(" ");
        }

//it must be CE button pressed
        cl.displayLabel.setText("0");cl.setClear=true;
    }//actionPerformed
}//class
					.addContainerGap(17, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(12)
					.addComponent(lblJavaApplicationWorld)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(17, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
