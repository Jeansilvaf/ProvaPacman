package br.com.fiap.pacman;

public class Player extends Gameobject {
	private int direction;
	private boolean Invencivel;
	private int life;

	private int getDirection() {
		return direction;
	}
	
	private boolean handlePosicaoX(int value) {
		setX(value);
		return true;
	}

	private boolean handlePosicaoY(int value) {
		setY(value);
		return true;
	}
	
	private void handleDirection(int direction) {
		if(invalidDirection(direction)) return;
		setDirection(direction);
	}
	
	public boolean getInvencivel() {
		return Invencivel;
	}

	public int getLife() {
		return life;
	}

	public boolean handleMove() {
		switch(getDirection()) {
			case 0:
				if (getY() - 10 == 0) return handlePosicaoY(0);
				if (getY() - 10 > 0) return handlePosicaoY(getY() - 10);
			break;

			case 90:
				if (getX() + 10 == getScreenSize()) return handlePosicaoX(getScreenSize());
				if (getX() + 10 < getScreenSize()) return handlePosicaoX(getX() + 10);
			break;
				
			case 180:
				if (getY() + 10 == getScreenSize()) return handlePosicaoY(getScreenSize());
				if (getY() + 10 < getScreenSize()) return handlePosicaoY(getY() + 10);
			break;
			
			case 270:
				if (getX() - 10 == 0) return handlePosicaoX(0);
				if (getX() - 10 > 0) return handlePosicaoX(getX() - 10);
			break;
		} 
		return false;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	public void setLife(int currentLife) {
		this.life = currentLife;
	}

	public void setInvencivel(boolean Invencivel) {
		this.Invencivel = Invencivel;
	}

	public Player(int PosicaoX, int PosicaoY, int initialDirection) {
		super(PosicaoX, PosicaoY);
		handleDirection(initialDirection);
	}
}
