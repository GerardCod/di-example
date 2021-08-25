package app.entities;

public class Pokemon {
    private Long id;
    private String name;
    private String specie;

    public Pokemon(Long id, String name, String specie) {
        this.id = id;
        this.name = name;
        this.specie = specie;
    }

    public Pokemon() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", specie='" + specie + '\'' +
                '}';
    }
}
