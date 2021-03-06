package step3.racingcar.domain;

public class RacingCar {

	private final Name name;
	private final MoveDistance moveDistance;

	public RacingCar(final String name) {
		this(name, 0);
	}

	public RacingCar(final String name, final int moveDistance) {
		this(new Name(name), new MoveDistance(moveDistance));
	}

	private RacingCar(final Name name, final MoveDistance moveDistance) {
		this.name = name;
		this.moveDistance = moveDistance;
	}

	public void move(final int value) {
		final int CAR_MOVABLE_VALUE = 4;

		if (value < CAR_MOVABLE_VALUE) {
			return;
		}

		this.increaseMoveDistance();
	}

	private void increaseMoveDistance() {
		this.moveDistance.increase();
	}

	public int getMoveDistance() {
		return this.moveDistance.getMoveDistance();
	}

	public String getName() {
		return this.name.getName();
	}

	public RacingCar copy() {
		return new RacingCar(this.name, this.moveDistance);
	}

	public boolean isSameMoveDistance(final MoveDistance moveDistance) {
		return this.moveDistance.equals(moveDistance);
	}


	@Override
	public boolean equals(final Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		final RacingCar racingCar = (RacingCar)o;

		if (name != null ? !name.equals(racingCar.name) : racingCar.name != null)
			return false;
		return moveDistance != null ? moveDistance.equals(racingCar.moveDistance) : racingCar.moveDistance == null;
	}

	@Override
	public int hashCode() {
		int result = name != null ? name.hashCode() : 0;
		result = 31 * result + (moveDistance != null ? moveDistance.hashCode() : 0);
		return result;
	}

}
