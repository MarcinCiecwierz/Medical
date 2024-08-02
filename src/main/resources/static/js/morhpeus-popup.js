function createHeatMapJson(objects) {

    const firstObject = objects[0];
    const columnNames = Object.keys(firstObject).filter(key => !['ensemblID', 'geneensembl', 'genebiotype', 'id'].includes(key));

    const heatMapJson = {
        rows: objects.length,
        columns: columnNames.length,
        seriesArrays: [],
        seriesDataTypes: ["Float32"],
        seriesNames: ["dataSeries"],
        rowMetadataModel: {
            vectors: [{
                name: "id",
                array: objects.map(obj => obj.geneensembl)
            }]
        },
        columnMetadataModel: {
            vectors: [{
                name: "id",
                array: columnNames
            }]
        }
    };

    const dataSeriesArray = objects.map(obj => {
        return columnNames.map(columnName => obj[columnName]);
    });

    heatMapJson.seriesArrays.push(dataSeriesArray);

    return heatMapJson;
}

let queries = [];

function openModal() {
    document.getElementById('searchModal').style.display = 'block';
}

function closeModal() {
    document.getElementById('searchModal').style.display = 'none';
}

function addQuery() {
    const searchInput = document.getElementById('searchInput');
    const query = searchInput.value.trim();

    if (query) {
        queries.push(query);
        displayQueries();
        searchInput.value = '';
    }
}

function displayQueries() {
    const searchList = document.getElementById('searchList');
    searchList.innerHTML = '';

    queries.forEach((query, index) => {
        const div = document.createElement('div');
        div.className = 'search-item';
        div.textContent = query;

        const deleteButton = document.createElement('button');
        deleteButton.textContent = 'x';
        deleteButton.onclick = () => removeQuery(index);

        div.appendChild(deleteButton);
        searchList.appendChild(div);
    });
}

function removeQuery(index) {
    queries.splice(index, 1);
    displayQueries();
}

function searchQueries() {

    fetch(`/search-heatmap?query=${encodeURIComponent(queries)}`)
        .then(response => response.json())
        .then(data => {
            console.log('Search Results:', data);
            openModal()
            const matrixContainer = document.getElementById('matrix-container');
            matrixContainer.innerHTML = '';
            new morpheus.HeatMap({
                el: document.getElementById('matrix-container'),
                dataset: morpheus.Dataset.fromJSON(createHeatMapJson(data))
            });

        })

}