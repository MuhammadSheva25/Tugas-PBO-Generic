public class Mahasiswa<T, U, V> {
    private T nim;
    private U name;
    private V studentClass;

    public void setNim(T nim) {
        this.nim = nim;
    }

    public T getNim() {
        return nim;
    }

    public void setName(U name) {
        this.name = name;
    }

    public U getName() {
        return name;
    }

    public void setStudentClass(V studentClass) {
        this.studentClass = studentClass;
    }

    public V getStudentClass() {
        return studentClass;
    }
}
