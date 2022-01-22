<%-- 
    Document   : index
    Created on : Jan 11, 2022, 10:05:57 PM
    Author     : OTTO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <title>Gestion Parking</title>
  <!-- base:css -->
  <link rel="stylesheet" href="template/css/materialdesignicons.min.css">
  <link rel="stylesheet" href="template/css/vendor.bundle.base.css">
  <!-- endinject -->
  <!-- inject:css -->
  <link rel="stylesheet" href="template/css/style.css">
  <!-- endinject -->
  <link rel="shortcut icon" href="template/images/favicon.png" />
  <script src="script/jquery-3.3.1.min.js" type="text/javascript"></script>
    <script src="script/Section.js" type="text/javascript"></script>
    
</head>

<body>
  <div class="container-scroller d-flex">
    <!-- partial:../../partials/_sidebar.html -->
    <%@include  file="template/menu.jsp" %>
    <!-- partial -->
    <div class="container-fluid page-body-wrapper">
      <!-- partial:../../partials/_navbar.html -->
      <%@include file="template/header.jsp" %>
      <!-- partial -->
      <div class="main-panel">
        <div class="content-wrapper">
            <div  class="card-body">
                                <fieldset>
                                    <legend>Gestion des Sections</legend>
                                    <table border="0">
                                        <tr>
                                            <td>Reference</td>
                                            <td> 
                                                <input id="ref" type="text" value=""  required=""/>
                                                <button class="btn btn-success" type="submit" id="add" > Ajouter </button>
                                                <button class="btn btn-warning" id="mod"> Modifier </button>
                                            </td>

                                        </tr>


                                    </table>
                                </fieldset>
                            </div>
            <div class="col-md-6" >
                <h2>Liste des Sections</h2>
                                 <div class="card">
                                    
                                    <fieldset>
                                        <table class="table">
                                            <thead>
                                                <tr>
                                                    <th scope="col">Id</th>
                                                    <th scope="col">Reference</th>
                                                    <th scope="col">Supprimer</th>
                                                    <th scope="col">Modifier</th>
                                                    <th scope="col">Generer</th>
                                                </tr>
                                            </thead>
                                            <tbody id="content">

                                            </tbody>
                                        </table>
                                    </fieldset>
                                </div>
                               
                            </div>
            
        </div>
        <!-- content-wrapper ends -->
        <!-- partial:../../partials/_footer.html -->
        <%@include file="template/footer.jsp" %>
        <!-- partial -->
      </div>
      <!-- main-panel ends -->
    </div>
    <!-- page-body-wrapper ends -->
  </div>
  <!-- container-scroller -->
  <!-- base:js -->
  <script src="../../vendors/js/vendor.bundle.base.js"></script>
  <!-- endinject -->
  <!-- Plugin js for this page-->
  <!-- End plugin js for this page-->
  <!-- inject:js -->
  <script src="../../js/off-canvas.js"></script>
  <script src="../../js/hoverable-collapse.js"></script>
  <script src="../../js/template.js"></script>
  <!-- endinject -->
  <!-- End custom js for this page-->
</body>

</html>

