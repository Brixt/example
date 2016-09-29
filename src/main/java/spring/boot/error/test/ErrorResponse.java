/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.boot.error.test;

public class ErrorResponse {

    private Throwable ex;

    public ErrorResponse(Throwable ex) {
        this.ex = ex;
    }

    public Object getResult() {
        return ex.getMessage();
    }

    public Object getDescription() {
        return ex.getStackTrace();
    }

}
