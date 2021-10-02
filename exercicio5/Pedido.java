package exercicioDois;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Pedido {
	
	private int num;
	private LocalDate dataPedido;
	private double qtd;
	private double valor;
	private double total;


	
	
	public Pedido(int num, LocalDate dataPedido, double qtd, double valor) {
		this.num = num;
		this.dataPedido = dataPedido;
		this.qtd = qtd;
		this.valor = valor;
	}



 public int getNum() {
		return num;
	}


	public LocalDate getDataPedido() {
		return this.dataPedido;
	}


	public double getQtd() {
		return this.qtd;
	}



	public double getValor() {
		return this.valor;
	}


	public double getTotal() {
		return this.total;
	}


	
	public void finalizar() {
		if (this.dataPedido.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
			this.total = (this.valor - this.valor * 0.1) * this.qtd;	
		}
		else {
			this.total = this.valor *  this.qtd;
		}
	}
	

}

