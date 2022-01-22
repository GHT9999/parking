/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function () {
    $.ajax({
        url: "PlaceController",
        data: {op: "load"},
        type: 'POST',
        success: function (data, textStatus, jqXHR) {
            
            remplir(data);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            alert(textStatus);
        }
    });
    $("#content").on("click", "#update", function ()
    {
        id = $(this).closest("tr").find("td").eq(0).text();
        etat = $(this).closest("tr").find("td").eq(2).text();
        
        $.ajax({
            url: "PlaceController",
            data: {op: "updateEtat", id: id , etat : etat},
            
            type: 'POST',
            success: function (data, textStatus, jqXHR) {
                remplir(data);
            },
            error: function (jqXHR, textStatus, errorThrown) {
                console.log(textStatus);
            }
        });

    });

    
    function remplir(data) {
        var ligne = "";
        data.forEach(function (e) {
            
            ligne += "<tr><td>" + e.idPlace + "</td><td>" + e.numero + "</td><td>" + e.etat + "</td><td>"+e.idSection + "</td><td><button class='btn btn-warning' id='update'>free/full</button></td></tr>";
           
        });
        $("#content").html(ligne);
        
    }
});