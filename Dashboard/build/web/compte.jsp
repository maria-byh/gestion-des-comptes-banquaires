<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Date"%>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Consulter un Compte</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            margin: 0;
            padding: 0;
            text-align: center;
            background-color: #f0f0f0;
            color: #333;
        }

        header {
            background-color: #ddd;
            color: #333;
            padding: 20px;
        }

        h1 {
            font-size: 24px;
            margin: 0;
        }

        .container {
            max-width: 600px;
            margin: 20px auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 8px;
            box-shadow: 0px 0px 15px 0px #ccc;
            text-align: left;
        }

        .info-item {
            margin-bottom: 15px;
        }

        .back-btn {
            background-color: #333;
            color: #fff;
            padding: 10px 15px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s ease;
            text-decoration: none;
            display: inline-block;
        }

        .back-btn:hover {
            background-color: #555;
        }
    </style>
</head>
<body>
    <header>
        <h1>Consulter un Compte</h1>
    </header>

    <div class="container">
        <div class="info-item">
            <strong>Numéro de Compte:</strong> <%= request.getParameter("numCompte") %>
        </div>
        <div class="info-item">
            <strong>Type de Compte:</strong> Individuel <!-- Replace with actual data from your backend -->
        </div>
        <div class="info-item">
            <strong>Date de Création:</strong> <%= new Date() %> <!-- Replace with actual data from your backend -->
        </div>
        <div class="info-item">
            <strong>Solde:</strong> 1000.00 <!-- Replace with actual data from your backend -->
        </div>
        <div class="info-item">
            <strong>Numéro d'Employé:</strong> Emp1 <!-- Replace with actual data from your backend -->
        </div>
        <div class="info-item">
            <strong>Code Client:</strong> Client1 <!-- Replace with actual data from your backend -->
        </div>

        <a href="#" class="back-btn" onclick="goBack()">Retour</a>
    </div>

    <script>
        function goBack() {
            window.history.back();
        }
    </script>
</body>
</html>