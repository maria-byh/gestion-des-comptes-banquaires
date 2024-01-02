<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ajouter un Compte</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            margin: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
        }

        .container {
            background: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 15px rgba(0, 0, 0, 0.1);
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
            margin-bottom: 20px;
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

        input,
        select {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            border: 1px solid #bbb;
            border-radius: 5px;
            font-size: 16px;
            box-sizing: border-box;
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
    <a href="#" class="retour-btn" onclick="history.back()">Retour</a>
    
    <div class="container">
        <h1>Ajouter un Compte</h1>
        <form action="ajoutCompte" method="post">
            <label for="numCompte">Numéro de Compte :</label>
            <input type="text" id="numCompte" name="numCompte" required>

            <label for="typeCompte">Type de Compte :</label>
            <select id="typeCompte" name="typeCompte" required>
                <option value="individuel">Individuel</option>
                <option value="joint">Joint</option>
            </select>

            <label for="dateCreation">Date de Création :</label>
            <input type="date" id="dateCreation" name="dateCreation" required>

            <label for="solde">Solde :</label>
            <input type="number" id="solde" name="solde" step="0.01" required>

            <label for="numEmploye">Numéro d'Employé :</label>
            <select id="numEmploye" name="numEmploye" required>
                <option value="Emp1">Emp1</option>
                <option value="Emp2">Emp2</option>
            </select>

            <label for="codeClient">Code Client :</label>
            <select id="codeClient" name="codeClient" required>
                <option value="Cl1">Cl1</option>
                <option value="Cl2">Cl2</option>
            </select>

            <input type="submit" value="Ajouter le Compte">
        </form>
    </div>
</body>
</html>