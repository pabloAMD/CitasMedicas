<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <!-- Modal -->
        <div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalCenterTitle">Crear Medico</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <form action="insertar-medico" method="POST">
                        <div class="modal-body">
                            <div class="form-group">
                                <label for="nombre">Nombre</label>
                                <input type="text" class="form-control" id="nombre" name="nombre" required="" placeholder="Marcelo" >
                            </div>
                            <div class="form-group">
                                <label for="nombre">Apellido</label>
                                <input type="text" class="form-control" id="apellido" name="apellido" required="" placeholder="Durazno" >
                            </div>
                            <div class="form-group">
                                <label for="nombre">Direccion</label>
                                <input type="text" class="form-control" id="direccion" name="direccion" required="" placeholder="P cordova" >
                            </div>
                            
                           <div class="form-group">
                                <label for="nombre">Telefono</label>
                                <input type="text" class="form-control" id="telefono" name="telefono" required="" placeholder="4031738" >
                            </div>
                            
                            <div class="form-group">
                                <label for="nombre">Cedula</label>
                                <input type="text" class="form-control" id="cedula" name="cedula" required="" placeholder="010323423" >
                            </div>
                            
                            <div class="form-group">
                                <label for="nombre">Email</label>
                                <input type="text" class="form-control" id="email" name="email" required="" placeholder="tdurazno@ups.edu.ec" >
                            </div>
                            
                            <div class="form-group">
                                <label for="nombre">Horario de atencion</label>
                                <input type="text" class="form-control" id="horarioAtencion" name="horarioAtencion" required="" placeholder=" 7 am - 8pm" >
                            </div>
                            
                            <div class="form-group">
                                <label for="nombre">Sueldo</label>
                                <input type="text" class="form-control" id="sueldo" name="sueldo" required="" placeholder="360.00" >
                            </div>
                           
                            
                        </div>
                        <div class="modal-footer">
                            <button type="button"  data-dismiss="modal">Cerrar</button>
                            <button type="submit" >Guardar</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
</body>
</html>