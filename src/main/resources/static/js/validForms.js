// Valid registration form

function validData(e) {
	
    e.preventDefault();
    
    var erreurFirstName = document.getElementById("erreur_First_Name");
    erreurFirstName.textContent = "";
    var erreurLastName = document.getElementById("erreur_Last_Name");
    erreurLastName.textContent = "";
    var erreurSexe = document.getElementById("erreur_Sexe");
    erreurSexe.textContent = "";
    var erreurEmailAddress = document.getElementById("erreur_Email_Address");
    erreurEmailAddress.textContent = "";
    var erreurPhoneNumber = document.getElementById("erreur_Phone_Number");
    erreurPhoneNumber.textContent = "";
    var erreurCountry = document.getElementById("erreur_Country");
    erreurCountry.textContent = "";
    var erreurCity = document.getElementById("erreur_City");
    erreurCity.textContent = "";
    var erreurIdCard = document.getElementById("erreur_Id_Card");
    erreurIdCard.textContent = "";
    var erreurPassword = document.getElementById("erreur_Password");
    erreurPassword.textContent = "";
    var erreurRepeatPassword = document.getElementById("erreur_Repeat_Password");
    erreurRepeatPassword.textContent = "";


    var firstName = document.getElementById("firstName");
    var lastName = document.getElementById("lastName");
    var sexe = document.getElementById("sexe");
    var emailAddress = document.getElementById("email");
    var phoneNumber = document.getElementById("phoneNumber");
    var country = document.getElementById("country");
    var city = document.getElementById("city");
    var idCard = document.getElementById("cardId");
    var password = document.getElementById("password");
    var repeatPassword = document.getElementById("repeatPassword");

	const emailRegex = /^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    const passRegex = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]{8,}$/;
    
    if (!firstName.value.length) {
        erreurFirstName.textContent = "Enter your first name";
        firstName.focus();
        return false;
    }
    if (!lastName.value.length) {
        erreurLastName.textContent = "Enter your last name";
        lastName.focus();
        return false;
    }
    if (sexe.value === "Select an Option") {
        erreurSexe.textContent = "Select your gender";
        sexe.focus();
        return false;
    }
    if (!emailAddress.value.length) {
        erreurEmailAddress.textContent = "Entrez your mail address";
        emailAddress.focus();
        return false;
    }
    if (!emailAddress.value.match(emailRegex)) {
        erreurEmailAddress.textContent = "The format of the email address is incorrect";
        emailAddress.focus();
        return false;
    }
    if (!phoneNumber.value.length) {
        erreurPhoneNumber.textContent = "Enter your phone number";
        phoneNumber.focus();
        return false;
    }
    if (country.value === "Select a country") {
        erreurCountry.textContent = "Select your country";
        country.focus();
        return false;
    }
    if (!city.value.length) {
        erreurCity.textContent = "Enter your city";
        city.focus();
        return false;
    }
    if (!idCard.value.length) {
        erreurIdCard.textContent = "Enter your Id Card";
        idCard.focus();
        return false;
    }
    if (!password.value.length) {
        erreurPassword.textContent = "Enter a password";
        password.focus();
        return false;
    }
    
    if (!password.value.match(passRegex)) {
        erreurPassword.textContent = "The password format is incorrect";
        password.focus();
        return false;
    }
    if (!repeatPassword.value.length) {
        erreurRepeatPassword.textContent = "Enter the password";
        repeatPassword.focus();
        return false;
    }
    
    if (password.value != repeatPassword.value) {
        erreurRepeatPassword.textContent = "The password does not match";
        repeatPassword.focus();
        return false;
    }
    document.form.submit();
}

// Valid contact us form 

function validContact(e) {
	
    e.preventDefault();
    
    var erreurFullName = document.getElementById("erreur_Full_Name");
    erreurFullName.textContent = "";
    var erreurEmail = document.getElementById("erreur_Email");
    erreurEmail.textContent = "";
    var erreurSubject = document.getElementById("erreur_Subject");
    erreurSubject.textContent = "";
    var erreurContent = document.getElementById("erreur_Content");
    erreurContent.textContent = "";


    var fullName = document.getElementById("fullName");
    var email = document.getElementById("email");
    var subject = document.getElementById("subject");
    var content = document.getElementById("content");

	const emailRegex = /^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
	const nameRegex = /^([\w]{3,})+\s+([\w\s]{3,})+$/i;
    
    if (!fullName.value.length) {
        erreurFullName.textContent = "Enter your full name";
        fullName.focus();
        return false;
    }
    if (!fullName.value.match(nameRegex)) {
        erreurFullName.textContent = "Enter your first and last name";
        fullName.focus();
        return false;
    }
    if (!email.value.length) {
        erreurEmail.textContent = "Entrez your mail address";
        email.focus();
        return false;
    }
    if (!email.value.match(emailRegex)) {
        erreurEmail.textContent = "The format of the email address is incorrect";
        email.focus();
        return false;
    }
    if (!subject.value.length) {
        erreurSubject.textContent = "Enter the subject";
        subject.focus();
        return false;
    }
    if (!content.value.length) {
        erreurContent.textContent = "Enter your message";
        content.focus();
        return false;
    }
    document.contact.submit();
}