<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Farmer Portal</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f2f2f2;
        }
        .container {
            max-width: 600px;
            margin: 50px auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        .form-group {
            margin-bottom: 20px;
        }
        .form-group label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
        }
        .form-group input {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
            font-size: 16px;
        }
        .form-group button {
            padding: 10px 20px;
            background-color: #007bff;
            color: #fff;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
        }
        .form-group button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

    <div class="container">
        <h2>Farmer Portal</h2>
        <form id="farmer-form">
            <div class="form-group">
                <label for="state">State:</label>
                <input type="text" id="state" name="state" required>
            </div>
            <div class="form-group">
                <label for="season">Season:</label>
                <input type="text" id="season" name="season" required>
            </div>
            <div class="form-group">
                <label for="year">Year:</label>
                <input type="text" id="year" name="year" required>
            </div>
            <div class="form-group">
                <label for="product">Product:</label>
                <input type="text" id="product" name="product" required>
            </div>
            <div class="form-group">
                <label for="unique-number">Unique Number:</label>
                <input type="text" id="unique-number" name="unique-number" required>
            </div>
            <div class="form-group">
                <button type="submit">Submit</button>
            </div>
        </form>
    </div>
    
   <!--  <script>
        // JavaScript code for handling form submission
        document.getElementById("farmer-form").addEventListener("submit", function(event) {
            event.preventDefault(); // Prevent the default form submission

            // Get form data
            var state = document.getElementById("state").value;
            var season = document.getElementById("season").value;
            var year = document.getElementById("year").value;
            var product = document.getElementById("product").value;
            var uniqueNumber = document.getElementById("unique-number").value;

            // Construct the URL
            var url = "http://localhost:9080/query";

            // Construct the request body
            var requestBody = new URLSearchParams();
            requestBody.append('state', state);
            requestBody.append('season', season);
            requestBody.append('year', year);
            requestBody.append('product', product);
            requestBody.append('uniqueNumber', uniqueNumber);

            // Make a POST request using fetch API
            fetch(url, {
                method: 'POST',
                body: requestBody
            })
            .then(response => response.json()) // Parse the JSON response
            .then(data => {
                // Handle the response data
                alert(JSON.stringify(data)); // Display the response data in an alert
            })
            .catch(error => {
                console.error('Error:', error); // Log any errors to the console
            });
        });
    </script> -->
    <script>
    // JavaScript code for handling form submission
    document.getElementById("farmer-form").addEventListener("submit", function(event) {
        event.preventDefault(); // Prevent the default form submission

        // Get form data
        var state = document.getElementById("state").value;
        var season = document.getElementById("season").value;
        var year = document.getElementById("year").value;
        var product = document.getElementById("product").value;
        var uniqueNumber = document.getElementById("unique-number").value;

        // Construct the URL
        var url = "http://localhost:9080/query";

        // Construct the request body
        var requestBody = new URLSearchParams();
        requestBody.append('state', state);
        requestBody.append('season', season);
        requestBody.append('year', year);
        requestBody.append('product', product);
        requestBody.append('uniqueNumber', uniqueNumber);

        // Make a POST request using fetch API
        fetch(url, {
            method: 'POST',
            body: requestBody
        })
        .then(response => response.json()) // Parse the JSON response
        .then(data => {
            // Handle the response data
            alert(JSON.stringify(data)); // Display the response data in an alert
        })
        .catch(error => {
            console.error('Error:', error); // Log any errors to the console
        });
    });
</script>
    
    
</body>
</html>
 