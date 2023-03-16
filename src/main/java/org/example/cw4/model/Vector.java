package org.example.cw4.model;

/**
 * Создаем класс -> создаем переменные класса -> создаем полный и пустой конструктор
 * -> гетеры и сеттеры-> переопределяем toString()
 */
public class Vector {
    private Double x;
    private Double y;
    private Double z;

    public Vector(Double x, Double y, Double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector() {

    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    /**
     * @param vector второй вектор для произведения
     * @return скалярное произведение
     */
    public double scalarMulti(Vector vector2) {
        return this.x * vector2.x + this.y * vector2.y + this.z * vector2.z;
    }

    public Vector vectorMulti(Vector vector2) {
        return new Vector(this.y * vector2.z - this.z * vector2.y,
                this.z * vector2.x - this.x * vector2.z,
                this.x * vector2.y - this.y * vector2.x);
    }

    /**
     * @param vector - второй вектор для вычисления угла
     * @return угол между векторами
     */
    public double cosVector(Vector vector) {
        return scalarMulti(vector) / (lengthVector() * vector.lengthVector());
    }

    /**
     * @return длинна вектора
     */
    public double lengthVector() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    /**
     * @param vector - второй вектор для вычисления суммы
     * @return вектор с суммой векторов
     */
    public Vector sumVector(Vector vector) {
        return new Vector(x + vector.x, y + vector.y, z + vector.z);
    }

    /**
     * @param vector - второй вектор для вычисления разницы
     * @return вектор с разницей векторов
     */
    public Vector difVector(Vector vector) {
        return new Vector(x - vector.x, y - vector.y, z - vector.z);
    }

}
