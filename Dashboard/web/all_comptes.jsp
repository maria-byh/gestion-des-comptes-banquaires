<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Consulter les Comptes</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            margin: 0;
            padding: 0;
            text-align: center;
            color: #464646;
        }

        header {
            padding: 20px;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        h1 {
            font-size: 24px;
            margin: 0;
        }

        .container {
            margin: 20px 0;
            padding: 20px;
            background-color: #fff;
            border-radius: 8px;
            text-align: center;
            width: 100%;
            box-sizing: border-box;
            display: flex;
            flex-direction: column;
            align-items: center;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }

        th, td {
            border: 1px solid #d5d5d5;
            padding: 15px;
            text-align: left;
        }

        th {
            background-color: #2c3e50;
            color: #ecf0f1;
        }

        .consulter-btn,
        .retour-btn {
            background-color: #333;
            color: #fff;
            padding: 10px 15px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s ease;
            text-decoration: none;
        }

        .consulter-btn:hover,
        .retour-btn:hover {
            background-color: #555;
        }
    </style>
</head>
<body>
    <header>
        <h1>Consulter les Comptes</h1>
        <a href="#" class="retour-btn" onclick="history.back()">Retour</a>
    </header>

    <div class="container">
        <table>
            <tr>
                <th>Numéro de Compte</th>
                <th>Type de Compte</th>
                <th>Date de Création</th>
                <th>Code Client</th>
                <th></th>
            </tr>

            <!-- Replace the dummy data with actual data from your backend -->
            <tr>
                <td>123456</td>
                <td>Individuel</td>
                <td>2023-01-01</td>
                <td>Client1</td>
                <td><a href="#" class="consulter-btn" onclick="consulterCompte('123456')">Consulter</a></td>
            </tr>

            <tr>
                <td>789012</td>
                <td>Joint</td>
                <td>2023-02-15</td>
                <td>Client2</td>
                <td><a href="#" class="consulter-btn" onclick="consulterCompte('789012')">Consulter</a></td>
            </tr>

            <!-- Add more rows as needed -->

        </table>
    </div>

    <script>
        function consulterCompte(numCompte) {
            window.location.href = 'compte.jsp' ;
        }
    </script>
</body>
</html>