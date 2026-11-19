

function saveIncome() {

    const transaction = {

        amount: document.getElementById("txtAmount").value,
        description: document.getElementById("txtDescription").value,
        category: document.getElementById("txtCategory").value,
        date: document.getElementById("txtDate").value,
        type: "income"

    };

    fetch("http://localhost:8080/transactions", {


        method: "POST",

        body: JSON.stringify(transaction),

        headers: {
            "Content-type": "application/json; charset=UTF-8"
        }


    })

    .then(r => r.json())

    document.getElementById("txtAmount").value = "";
    document.getElementById("txtCategory").value = "";
    document.getElementById("txtDate").value = "";
    document.getElementById("txtDescription").value = "";
}



function saveExpense() {
    document.getElementById("txtAmountExpense").value = "";
    document.getElementById("txtCategoryExpense").value = "";
    document.getElementById("txtDateExpense").value = "";
    document.getElementById("txtDescriptionExpense").value = "";
}