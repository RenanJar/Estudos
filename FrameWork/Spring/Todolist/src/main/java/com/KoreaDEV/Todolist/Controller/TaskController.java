package com.KoreaDEV.Todolist.Controller;

import com.KoreaDEV.Todolist.model.Task;
import com.KoreaDEV.Todolist.service.TaskService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor

public class TaskController {

    private static final Logger logger= LoggerFactory.getLogger(TaskController.class);

    TaskService taskService;

    @Operation(summary = "Generate a new Task",description = "Generates a task and the following items are mandatory: Title, description and expiration date of the task",
            tags = {"Create task"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201",description = "Task created successfully"),
            @ApiResponse(responseCode = "500",description = "There was an error creating the task check the information")
    })

    @PostMapping("/tasks")
    @ResponseStatus(HttpStatus.CREATED)
    public Task createTask(@RequestBody Task task) {
        logger.info("Criando nova tarefa com as informações[{}]",task);

        return taskService.createTask(task);
    }
    @Operation(summary = "Consult all tasks",description = "list all tasks",
            tags = {"Consult task"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201",description = "tasks listed successfully"),
            @ApiResponse(responseCode = "500",description = "there was an error listing tasks")
    })
    @GetMapping("/tasks")
    @ResponseStatus(HttpStatus.OK)
    public List<Task> getAllTasks() {
        logger.info("Listando todas as tarefas cadastradas");
        return taskService.listAlltasks();
    }

    @Operation(summary = "searching for a task by id",description = "find a task by an id",
            tags = {"Consult task"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",description = "task found successfully"),
            @ApiResponse(responseCode = "404",description = "could not find any task with this id")
    })
    @GetMapping("/tasks/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Task> getTaskById(@PathVariable(value = "id") Long id) {
        logger.info("Buscando tarefa com o id[{}]",id);
        return taskService.findTaskById(id);

    }

    @Operation(summary ="Update task",description = "update a task through an id",tags = {"Update"})
    @ApiResponses(value ={
            @ApiResponse(responseCode ="200",description = "Task updated successfully"),
            @ApiResponse(responseCode = "404",description = "Could not update task, task not found")
    })

    @PutMapping("/tasks/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Task> updateTaskById(@PathVariable(value = "id") Long id, @RequestBody Task task) {
        logger.info("Atualizando a tarefa com id [{}]as novas informações são : [{}]",id,task);
        return taskService.updateTaskById(task, id);
    }

    @Operation(summary ="Delete task",description = "Delete a task through an id",tags = {"Delete"})
    @ApiResponses(value ={
            @ApiResponse(responseCode ="204",description = "Task deletet successfully"),
            @ApiResponse(responseCode = "404",description = "Could not delete task, task not found")
    })
    @DeleteMapping("/tasks/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<Object> deleteTaskById(@PathVariable(value = "id")Long id){
        logger.info("Excluindo tarefa com o id[{}]",id);
        return taskService.deleteById(id);
    }
}
