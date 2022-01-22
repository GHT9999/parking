<%-- 
    Document   : place.jsp
    Created on : Jan 11, 2022, 1:44:59 AM
    Author     : OTTO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">

<head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <title>Gestion Parking</title>
  <link rel="stylesheet" href="template/css/materialdesignicons.min.css">
  <link rel="stylesheet" href="template/css/vendor.bundle.base.css">
  <link rel="stylesheet" href="template/css/style.css">
  <link rel="shortcut icon" href="template/images/favicon.png" />
  
  <script src="script/jquery-3.3.1.min.js" type="text/javascript"></script>
  <script src="script/Place.js" type="text/javascript"></script>
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
            <div class="col-md-6" >
                <h2>Liste des places</h2>
                                 <div class="card">
                                    
                                    <fieldset>
                                        <table class="table">
                                            <thead>
                                                <tr>
                                                    <th scope="col">IdPlace</th>
                                                    <th scope="col">Numero</th>
                                                    <th scope="col">Etat</th>
                                                    <th scope="col">idSection </th>
                                                    <th scope="col">free/full</th>
                                                    
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
  
  <script src="../../vendors/js/vendor.bundle.base.js"></script>
  
  <script src="../../js/off-canvas.js"></script>
  <script src="../../js/hoverable-collapse.js"></script>
  <script src="../../js/template.js"></script>
  
</body>

</html>