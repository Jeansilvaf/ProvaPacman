package br.com.fiap.pacman;

public class Ghost extends Gameobject {
    private int direction;
	private final int[] directions = {0, 90, 180, 270};

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
	
	public void handleMove() {
		int random = new Random().nextInt(directions.length);

		switch(getDirection()) {
			case 0:
				if (getY() > 0) {
					handlePosicaoY(getY() - 10);
				} else if (getY() <= 0) {
					setDirection(directions[random]);
					handlePosicaoY(0);
				}
			break;

			case 90: 
				if (getX() < getScreenSize()) {
					handlePosicaoX(getX() + 10);
				} else if (getX() >= getScreenSize()) {
					setDirection(directions[random]);
					handlePosicaoX(getScreenSize());
				}
			break;

			case 180:
				if (getY() < getScreenSize()) {
					handlePosicaoY(getY() + 10);
				} else if (getY() >= getScreenSize()) {
					setDirection(directions[random]);
					handlePosicaoY(getScreenSize());
				}
			break;
			
			case 270:
				if (getX() > 0) {
					handlePosicaoX(getX() - 10);
				} else if (getX() <= 0) {
					setDirection(directions[random]);
					handlePosicaoX(0);
				}
			break;
		}
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	public Ghost(int PosicaoX, int PosicaoY, int initialDirection) {
		super(PosicaoX, PosicaoY);
		handleDirection(initialDirection);
	}
}
