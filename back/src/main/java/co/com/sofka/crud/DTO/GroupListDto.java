package co.com.sofka.crud.DTO;

import java.util.List;

public class GroupListDto {

    private Long id;
    private String name;
    private List<TodoDto> todosDTO;



    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TodoDto> getTodosDTO() {
        return todosDTO;
    }

    public void setTodosDTO(List<TodoDto> todosDTO) {
        this.todosDTO = todosDTO;
    }
}
