package br.com.fiap.pacman;

public class Gameobject {
	private int PosicaoX;
	private int PosicaoY;
	private int screenSize;

	private void handleCoordinates(int PosicaoX, int PosicaoY) {
		setX(PosicaoX);
		setY(PosicaoY);
	}

	public int getX() {
		return PosicaoX;
	}

	public int getY() {
		return PosicaoY;
	}

	public int getScreenSize() {
		return screenSize;
	}

	public void setX(int PosicaoX) {
		this.PosicaoX = PosicaoX;
	}

	public void setY(int PosicaoY) {
		this.PosicaoY = PosicaoY;
	}

	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}
	
	public boolean invalidCoord(int PosicaoX, int PosicaoY) {
		if ((PosicaoX < 0 || PosicaoX > 600) || (PosicaoY < 0 || PosicaoY > 600)) return true;
		return false;
	}
	
	public boolean invalidDirection(int direction) {
		if (direction < 0 || direction > 600) return true;
		return false;
	}

	public Gameobject(int PosicaoX, int PosicaoY) {
		if (invalidCoord(PosicaoX, PosicaoY)) return;
		handleCoordinates(PosicaoX, PosicaoY);
	}
}