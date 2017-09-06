/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

import com.entidades.Actor;
import com.jpa.controlador.ActorJpaController;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author jcortes
 */
public class JavaBeanActor {
    private EntityManagerFactory emf;
    private ActorJpaController ActorControl; 
    public JavaBeanActor(){
        emf = Persistence.createEntityManagerFactory("JavaWebJPAJSPPU");
        ActorControl = new ActorJpaController(emf);
    }
    public void Guardar(Actor actor){
        ActorControl.create(actor);
    }
    public List<Actor> buscarTodos(){
        return ActorControl.findActorEntities();
    }
}
