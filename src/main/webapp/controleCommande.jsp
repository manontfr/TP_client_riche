<%@ page pageEncoding="UTF-8"%>
<%@ include file="enTetePage.html"%>

    <head>
        <meta charset="utf-8" />
        <title>Payer la commande</title>

    </head>
    <body>
        <form method="post" action="renseignement" id="formulaire">
            <fieldset>
                <legend>Inscription</legend>
                
                <label for="email">Adresse email <span class="requis">*</span></label>
                <input type="text" id="email" name="email" value="" size="20" maxlength="60" />
                <br />
                
                <label for="email">Prenom <span class="requis">*</span></label>
                <input type="text" id="prenom" name="email" value="" size="20" maxlength="60" />
                <br />
                
                <label for="motdepasse">Nom <span class="requis">*</span></label>
                <input type="text" id="nom" name="nom" value="" size="20" maxlength="20" />
                <br />

                <label for="confirmation">Adresse postale<span class="requis">*</span></label>
                <input type="text" id="Adresse" name="AdressePostale" value="" size="50" maxlength="100" />
                <br />

                <label for="nom">Code postale</label>
                <input type="text" id="codePostale" name="nom" value="" size="20" maxlength="20" />
                <br />
                <label for="nom">Ville</label>
                <input type="text" id="ville" name="ville" value="" size="20" maxlength="20" />
                <br />
                
            </fieldset>
        </form>
    	<script src="https://www.paypal.com/sdk/js?client-id=sb"></script>
		<script>paypal.Buttons().render('body');</script>
    </body>


