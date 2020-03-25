package racinggame.domain.car;

import racinggame.util.NumberUtil;

/**
 * 1. 움직이는 거리 필드
 * 1. 자동차 이름 필드
 * 1. 게임 진행시 자동차 이동
 * 1. 정렬
 */
public class Car implements Comparable<Car> {
    private final String carName;
    private int moveRange = 0;

    public Car(String carName) {
        this.carName = carName;
    }

    public Car(String carName, int moveRange) {
        this.carName = carName;
        this.moveRange = moveRange;
    }

    /**
     * 랜던값이 4보다 크면 자동차 한칸 이동
     */
    public void moveCar() {
        if (NumberUtil.isGreaterThan4((NumberUtil.createRandomIntIn0to9()))) {
            this.moveRange++;
        }
    }

    @Override
    public int compareTo(Car o) {
        return Integer.compare(this.moveRange, o.getMoveRange());
    }

    public int getMoveRange() {
        return this.moveRange;
    }

    public String getCarName() {
        return this.carName;
    }
}