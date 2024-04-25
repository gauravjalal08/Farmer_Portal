<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Search Results</title>
    
    <style>
        table {
            border-collapse: collapse;
            width: 100%;
        }
        th, td {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }
        th {
            background-color: #d8efd2;
        }

        .btn-submit {
            background-color: #29ac2d;
            color: white;
            width: 130px; /* Adjust width as needed */
            height: 40px; /*
            }
    </style>
</head>
<body>
    {% if main_result %}
    <h2>Policy Details:</h2>
    <table>
        <thead>
            <tr>
                <th>State</th>
                <th>Product</th>
                <th>Season</th>
                <th>Year</th>
                <th>Party Name</th>
                <th>Policy Number</th>
                <th>Policy Status</th>
                <th>Farmer Name</th>
                <th>Crop Name</th>
                <th>Area Insured (Ha)</th>
                <th>Premium Amount</th>
                <th>Sum Insured</th>
            </tr>
        </thead>
        <tbody>
            {% for row in main_result %}
                <tr>
                    <td>{{ row['CM_STATE_NAME'] }}</td>
                    <td>{{ row['PRODUCT_CD'] }}</td>
                    <td>{{ row['CROP_SEASON_NAME'] }}</td>
                    <td>{{ row['YEAR_CD'] }}</td>
                    <td>{{ row['PARTY_NAME'] }}</td>
                    <td>{{ row['POLICY_NUMBER'] }}</td>
                    <td>{{ row['POLICY_STATUS_CD'] }}</td>
                    <td>{{ row['ACCOUNT_HOLDER_NAME'] }}</td>
                    <td>{{ row['CROP_NAME'] }}</td>
                    <td>{{ row['AREA_INSURED_HA'] }}</td>
                    <td>{{ row['NET_PREMIUM_AMOUNT'] }}</td>
                    <td>{{ row['TOTAL_SUM_INSURED'] }}</td>
                </tr>
            {% endfor %}
        </tbody>
    </table>

    <h2>Account Details:</h2>
        <table>
            <thead>
                <tr>
                    <th>IFSC CODE</th>
                    <th>Bank Name</th>
                    <th>Branch Name</th>
                    <th>Bank A/c No</th>
                    
                </tr>
            </thead>
            <tbody>
                {% for row in main_result %}
                    <tr>
                        <td>{{ row['IFS_CD'] }}</td>
                        <td>{{ row['BANK_NAME'] }}</td>
                        <td>{{ row['BRANCH_NAME'] }}</td>
                        <td>{{ row['BANK_ACCOUNT_NUMBER'] }}</td>
                    </tr>
                {% endfor %}
            </tbody>
        </table>

    {% endif %}

    {% if claim_result %}
        <h2>Claim Details:</h2>
        <table>
            <thead>
                <tr>
                    <th>Claim Type</th>
                    <th>Claim Amount</th>
                    <th>Claim Approved Date</th>
                    <th>Claim Status</th>
                </tr>
            </thead>
            <tbody>
                {% for row in claim_result %}
                    <tr>
                        <td>{{ row['CL_CLAIM_TYPE_CD'] }}</td>
                        <td>{{ row['CL_CLAIM_APPROVED_AMOUNT'] }}</td>
                        <td>{{ row['CL_APPRV_DATE'] }}</td>
                        <td>{{ row['CLAIM_STATUS_CD'] }}</td>

                    </tr>
                {% endfor %}
            </tbody>
        </table>
    {% endif %}

    {% if error_message %}
        <p>{{ error_message }}</p>
    {% endif %}
    
    <br>
    <button class= "btn-submit" onclick="goBack()">Back to Search</button>

<script>
    function goBack() {
        window.history.back();
    }
</script>
</body>
</html>
