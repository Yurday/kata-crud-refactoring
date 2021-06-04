package co.com.sofka.crud;

import java.util.List;

public class ListDTO {

    private Long id;
    private String name;
    private List<TodoDTO> todosDTO;



    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TodoDTO> getTodosDTO() {
        return todosDTO;
    }

    public void setTodosDTO(List<TodoDTO> todosDTO) {
        this.todosDTO = todosDTO;
    }
}
