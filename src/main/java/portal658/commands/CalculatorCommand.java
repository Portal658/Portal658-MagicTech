package portal658.commands;

import java.util.LinkedList;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentString;

public class CalculatorCommand extends CommandBase
{

	@Override
	public String getName()
	{
		return "calc";
	}

	@Override
	public String getUsage(ICommandSender sender)
	{
		return "commands.calc.usage";
	}

	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException
	{
		boolean flag_rpn = true; 
		String command = args[0];
		for (int i = 0; i < command.length(); ++i)
		{
			int symbol_code = command.charAt(i);
			if (!((symbol_code > 39 && symbol_code < 44) || (symbol_code > 44 && symbol_code < 58)))
			{
				flag_rpn = false;
				break;
			}
		}
		System.out.println(flag_rpn);
		System.out.println(command);
		if (flag_rpn)
		{
			double result = Calculator(command);
			System.out.println(result);
			if (sender instanceof EntityPlayer)
			{
				sender.sendMessage(new TextComponentString("Calc: " + command + " = " + result));
	        }
		}
	}
	
	@Override
    public boolean checkPermission(MinecraftServer server, ICommandSender sender)
	{
        return true;
    }

	private double Calculator(String command)
	{
		LinkedList<Double> someDoubles = new LinkedList<>();
		LinkedList<Character> someOpers = new LinkedList<>();
		for(int i = 0; i < command.length(); ++i)
		{
			char c = command.charAt(i);
			if(c == '(')
			{
				someOpers.add('(');
			}
			else if (c == ')')
			{
				while(someOpers.getLast() != '(')
				{
					pars(someDoubles, someOpers.removeLast());
				}
				someOpers.removeLast();
			}
			else if (isOperator(c))
			{
				while(!someOpers.isEmpty() && getPriority(someOpers.getLast()) >= getPriority(c))
				{
					pars(someDoubles, someOpers.removeLast());
					
				}
				someOpers.add(c);
			}
			else
			{
				String operand = "";
				while(i < command.length() && (Character.isDigit(command.charAt(i)) || command.charAt(i) == '.'))
				{
					operand += command.charAt(i++);
				}
				--i;
				someDoubles.add(Double.parseDouble(operand));
			}
		}
		while(!someOpers.isEmpty())
		{
			pars(someDoubles, someOpers.removeLast());
		}
		 return someDoubles.get(0);
	}
	
	private boolean isOperator(char c)
	{
		return c == '+' || c == '-' || c == '*' || c == '/';
	}
	
	private int getPriority(char oper)
	{
		if(oper == '*' || oper == '/')
		{
			return 1;
		}
		else if(oper == '+' || oper == '-')
		{
			return 0;
		}
		else
		{
			return -1;
		}
	}
	
	private void pars(LinkedList<Double> st, char oper)
	{
		double someOne = st.removeLast();
		double someTwo = st.removeLast();
		switch(oper)
		{
		case '+':
			st.add(someTwo + someOne);
			break;
		case '-':
			st.add(someTwo - someOne);
			break;
		case '*':
			st.add(someTwo * someOne);
			break;
		case '/':
			st.add(someTwo / someOne);
			break;
		}
	}
}
