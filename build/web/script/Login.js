/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function () {
    $("#log").click(function () {
        var username = $("#username").val();
        var password = $("#password").val();
        alert(username);
        $.ajax({
            url: "LoginController",
            data: {op: "log", username: username, password: password},
            type: 'POST',
            success: function (data, textStatus, jqXHR) {

                if (data ==="1") {
                    window.location.replace("/Parking/index.jsp");
                }


                console.log(data);
            },
            error: function (jqXHR, textStatus, errorThrown) {
                console.log(textStatus);
            }
        });
    });

})