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
                        <h5 class="modal-title" id="exampleModalCenterTitle">Crear Agenda</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <form action="insertar-agenda" method="POST">
                        <div class="modal-body">
                            <div class="form-group">
                                <label for="nombre">Notas</label>
                                <input type="text" class="form-control" id="notas" name="notas" required="" placeholder="descripcion de actividad" >
                            </div>
                            <div class="form-group">
                                <label for="nombre">Fecha</label>
                                <input type="text" class="form-control" id="fecha" name="fecha" required="" placeholder="yyyy-mm-dd" >
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