<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Effectuer un Versement</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            margin: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .container {
            background: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0px 0px 15px 0px #888888;
            text-align: center;
            max-width: 600px;
            width: 100%;
            box-sizing: border-box;
            display: flex;
            flex-direction: column;
            align-items: center;
        }

        h1 {
            font-size: 24px;
            color: #333;
        }

        form {
            text-align: left;
            margin-top: 20px;
            width: 100%;
        }

        label {
            display: block;
            font-weight: bold;
            margin-top: 10px;
            color: #333;
        }

        select,
        input[type="text"],
        input[type="number"],
        input[type="date"] {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            border: 1px solid #bbb;
            border-radius: 5px;
            font-size: 16px;
            box-sizing: border-box;
        }

        .row {
            display: flex;
            justify-content: space-between;
        }

        .row select {
            width: 48%;
        }

        input[type="submit"] {
            background-color: #333;
            color: #fff;
            border: none;
            padding: 10px 20px;
            cursor: pointer;
            border-radius: 5px;
            margin-top: 10px;
        }

        input[type="submit"]:hover {
            background-color: #555;
        }

        .retour-btn {
            background-color: #333;
            color: #fff;
            border: none;
            padding: 5px 10px;
            cursor: pointer;
            border-radius: 5px;
            position: absolute;
            top: 10px;
            left: 10px;
        }

        .retour-btn:hover {
            background-color: #555;
        }
    </style>
</head>
<body>
    <button class="retour-btn" onclick="goBack()">Retour</button>
    <div class="container">
        <h1>Effectuer un Versement</h1>
        <form action="effectuerVersement" method="post">
            <label for="numOperation">Numéro d'Opération :</label>
            <input type="text" id="numOperation" name="numOperation" required>

            <label for="typeOperation">Type d'Opération :</label>
            <select id="typeOperation" name="typeOperation" required>
                <option value="versement">Versement</option>
            </select>

            <label for="dateOperation">Date d'Opération :</label>
            <input type="date" id="dateOperation" name="dateOperation" required>

            <label for="numEmploye">Numéro d'Employé :</label>
            <select id="numEmploye" name="numEmploye" required>
                <option value="Emp1">Emp1</option>
                <option value="Emp2">Emp2</option>
            </select>

            <div class="row">
                <label for="numCompteSource">Numéro de Compte Source :</label>
                <select id="numCompteSource" name="numCompteSource" required>
                    <option value="12345">12345</option>
                    <option value="67890">67890</option>
                </select>
            </div>

            <div class="row">
                <label for="numCompteDestination">Numéro de Compte Destination :</label>
                <select id="numCompteDestination" name="numCompteDestination" required>
                    <option value="54321">54321</option>
                    <option value="09876">09876</option>
                </select>
            </div>

            <label for="montant">Montant :</label>
            <input type="number" id="montant" name="montant" step="0.01" required>

            <input type="submit" value="Effectuer le Versement">
        </form>
    </div>

    <script>
        function goBack() {
            window.history.back();
        }
    </script>
</body>
</html>